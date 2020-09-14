import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageComponents.CompareItems;
import pageComponents.DeleteFromCompareList;
import pageComponents.SearchFor;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.*;

public class TestRun {

    private final String baseURL = "https://rozetka.com.ua/";
    SearchFor searchFor = new SearchFor();
    CompareItems compareItems = new CompareItems();
    DeleteFromCompareList deleteFromCompareList = new DeleteFromCompareList();

    @BeforeMethod
    public void beforeMethod() {
        isChrome();
        open(baseURL);
        Configuration.timeout = 10000;
    }

    @Test
    public void compareItems(){
        searchFor.getSearchInput().val("планшеты").pressEnter();

        compareItems.getCompareFirstItem().click();
        compareItems.getCompareSecondItem().click();
        compareItems.getCompareThirdItem().click();
        if (compareItems.getQuestionPopup().isDisplayed()) {
            compareItems.getQuestionPopupClose().click();
        }
        compareItems.getCompareAllItems().click();
        compareItems.getCompareAllItemsVisual().click();
        compareItems.getCompareAllItemsNewPage().waitUntil(Condition.appear, 3000);

        /*
        test case for delete feature of all items from compare list
        test == pass
         */
//        deleteFromCompareList.getSelectAllSelectedItems().click();
//        deleteFromCompareList.getDeleteAllItemFromList().click();
//        deleteFromCompareList.getCloseTheModalWindow().click();


        /*
        test case for delete feature of items from compare list one-by-one
         */
        deleteFromCompareList.getDeleteFirstItemFromList().click();
        deleteFromCompareList.getConfirmationDeleteFirstItemFromList().click();
        deleteFromCompareList.getDeleteSecondItemFromList().click();
        deleteFromCompareList.getConfirmationDeleteSecondItemFromList().click();
        deleteFromCompareList.getDeleteThirdItemFromList().click();
        deleteFromCompareList.getConfirmationDDeleteThirdItemFromList().click();
        //deleteFromCompareList.getCloseTheModalWindow().click();


    }

//    @AfterClass
//    public void tearDown() {
//
//    }
}
