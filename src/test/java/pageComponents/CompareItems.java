package pageComponents;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CompareItems {
    ElementsCollection compareFirstItem = $$(byXpath("//*[contains(@class,'compare-button')]"));

    public SelenideElement getCompareFirstItem() {
        return compareFirstItem.get(0);
    }

    public SelenideElement getCompareSecondItem() {
        return compareFirstItem.get(1);
    }

    public SelenideElement getCompareThirdItem() {
        return compareFirstItem.get(2);
    }

    SelenideElement compareAllItems = $(byXpath("//button[@class='header-actions__button header-actions__button_type_compare header-actions__button_state_active']"));

    public SelenideElement getCompareAllItems() {
        return compareAllItems;
    }

    SelenideElement compareAllItemsVisual = $(byXpath("//*[@class='comparison-modal__link']"));

    public SelenideElement getCompareAllItemsVisual() {
        return compareAllItemsVisual;
    }

    SelenideElement compareAllItemsNewPage = $(byText("Сравниваем планшеты"));

    public SelenideElement getCompareAllItemsNewPage() {
        return compareAllItemsNewPage;
    }

    SelenideElement questionPopup = $(By.xpath("//*[@id='rz-banner']"));
    public SelenideElement getQuestionPopup() {
        return questionPopup;
    }

    SelenideElement questionPopupClose = $(By.xpath("//*[@id='rz-banner']//*[@class='exponea-close-cross']"));
    public SelenideElement getQuestionPopupClose() {
        return questionPopupClose;
    }
}
