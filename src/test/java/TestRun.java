import com.codeborne.selenide.Condition;
import configuration.TestConfiguration;
import org.testng.annotations.Test;
import pageComponents.CompareItems;
import pageComponents.DeleteFromCompareList;
import pageComponents.SearchFor;

public class TestRun extends TestConfiguration {

    SearchFor searchFor = new SearchFor();
    CompareItems compareItems = new CompareItems();
    DeleteFromCompareList deleteFromCompareList = new DeleteFromCompareList();

    @Test
    public void compareItems(){
        searchFor.getSearchInput().val("планшеты").pressEnter();

        compareItems.getCompareFirstItem().click();
        compareItems.getCompareFirstItem().getAttribute("class").contains("active");
        compareItems.getCompareSecondItem().click();
        compareItems.getCompareSecondItem().getAttribute("class").contains("active");
        compareItems.getCompareThirdItem().click();
        compareItems.getCompareThirdItem().getAttribute("class").contains("active");

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
        deleteFromCompareList.getConfirmationDeleteThirdItemFromList().click();

    }

}
