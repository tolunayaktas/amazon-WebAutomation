@home
Feature: Test Suite
  Açıklama
  Açıklama

  @Deneme @arama
  Scenario: Test Case 1
    Given ortama getirme
    When eylem gerçekleştirme "sdasdasdas"
    Then kontrol yapılması

  @Deneme @Enes  @arama
  Scenario: Test Case 2
    Given ortama getirme
    When eylem gerçekleştirme
    Then kontrol yapılması

  @arama
  Scenario: Test Case 3
    Given ortama getirme
    When eylem gerçekleştirme
    Then kontrol yapılması

  @Mac @sonuc
  Scenario: Reach a product by Searching
    Given Go to the Site
    When click searchbar and type "Macbook"
    When Click the shown product
    Then Check whether youre right product


  @Lense @sonuc
  Scenario: Find the certain lense
    Given Go to the Site
    When Click the all menu
    When Click electronics
    When Click cameras
    When Filter by "SAMSUNG" and "Lenses"
    Then check if the product exists


  @iphone @sonuc
  Scenario: Reach the certain iPhone
    Given Go to the Site
    When click searchbar and type iphone 13
    Then Check the shown product

