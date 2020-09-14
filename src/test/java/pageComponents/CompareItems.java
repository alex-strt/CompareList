package pageComponents;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CompareItems {
    SelenideElement compareFirstItem = $(byXpath("//*[@class='compare-button']"));

    public SelenideElement getCompareFirstItem() {
        return compareFirstItem;
    }

    SelenideElement compareSecondItem = $(byXpath("//*[@class='compare-button']"));

    public SelenideElement getCompareSecondItem() {
        return compareSecondItem;
    }

    SelenideElement compareThirdItem = $(byXpath("//*[@class='compare-button']"));

    public SelenideElement getCompareThirdItem() {
        return compareThirdItem;
    }

    SelenideElement compareAllItems = $(byXpath("//button[@class='header-actions__button header-actions__button_type_compare header-actions__button_state_active'][contains(.,'3')]"));

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
