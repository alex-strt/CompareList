package pageComponents;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DeleteFromCompareList {


    SelenideElement selectAllSelectedItems = $(byXpath("//button[@class='header-actions__button header-actions__button_type_compare header-actions__button_state_active'][contains(.,'3')]"));

    public SelenideElement getSelectAllSelectedItems() {

        return selectAllSelectedItems;

    }


    SelenideElement deleteAllItemFromList = $(byXpath("//button[contains(@class,'button button--medium button--icon button--white comparison-modal__remove')]"));

    public SelenideElement getDeleteAllItemFromList() {

        return deleteAllItemFromList;

    }

//    //old version

    SelenideElement deleteFirstItemFromList = $(byXpath("//button[contains(@aria-controls,'comparisonProductActions0')]"));

    public SelenideElement getDeleteFirstItemFromList() {

        return deleteFirstItemFromList;

    }

    SelenideElement confirmationDeleteFirstItemFromList = $(byXpath("//button[@class='button button--medium button--with-icon button--link context-menu-actions__button'][contains(.,'Удалить')]"));

    public SelenideElement getConfirmationDeleteFirstItemFromList() {

        return confirmationDeleteFirstItemFromList;

    }

    SelenideElement deleteSecondItemFromList = $(byXpath("//button[@aria-controls='comparisonProductActions0']"));

    public SelenideElement getDeleteSecondItemFromList() {

        return deleteSecondItemFromList;

    }

    SelenideElement confirmationDeleteSecondItemFromList = $(byXpath("//button[contains(.,'Удалить')]"));

    public SelenideElement getConfirmationDeleteSecondItemFromList() {

        return confirmationDeleteSecondItemFromList;

    }


    SelenideElement deleteThirdItemFromList = $(byXpath("//button[@aria-controls='comparisonProductActions0']"));

    public SelenideElement getDeleteThirdItemFromList() {

        return deleteThirdItemFromList;

    }

    SelenideElement confirmationDeleteThirdItemFromList = $(byXpath("//button[contains(.,'Удалить')]"));

    public SelenideElement getConfirmationDeleteThirdItemFromList() {

        return confirmationDeleteThirdItemFromList;

    }


    SelenideElement closeTheModalWindow = $(byXpath("//button[contains(@aria-label,'Закрыть модальное окно')]"));

    public SelenideElement getCloseTheModalWindow() {

        return closeTheModalWindow;

    }
}



