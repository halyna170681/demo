<h2>Example of project with Allure report for TestNG amd Junit5</h2>

<h3>Technologies:</h3>

- Selenium 4 (Chrome Driver - version 113, Firefox)
- TestNG
- Junit5
- Allure
- Maven

<h3>To run tests please follow the steps:</h3>

1. Select JUnit5 or TestNg
1. Go to pom.xml and uncomment needed part according to selection above
1. Install allure command tools
1. Run test from `java/junitExample` or `java/testNgExample`
1. Run command 

```
allure serve path_to_allure_results_folder/allure-results
```
Questions:
1. Header
   1. testFindDealerSectionExists fail
2. Footer
   1. Only testCaPrivacyExists pass, rest fail (not closing new tab and not switching back to main window? Fixed in TestHelpers)
3. CommercialVehicleCenterByStates
   1. Only TC19 exist, no TC18, TC20-21
4. ProCommercialResources
   1. Only testOpenFordUpfits test pass, rest fail (not closing new tab and not switching back to main window? Fixed in TestHelpers)
5. SearchByDealerName
   1. Extend test to pass "query" as parameter or have is as variable?
6. Run tests not from IDE
7. Test reports? Allure?
8. @step annotation?
9. public abstract class BasePage ?
10. Cannot find css. Example a[href="//ford.com/help/privacy"]
11. Filters test? Case 22?
