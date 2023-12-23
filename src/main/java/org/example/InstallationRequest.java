package org.example;

import java.util.List;

public class InstallationRequest {
    private Customer customer;
    private List<Product> requestedProducts;
    private String preferredDate;

    /*public InstallationRequest(String customer, String requestedProducts, String preferredDate) {
        this.customer = customer;
        this.requestedProducts = requestedProducts;
        this.preferredDate = preferredDate;
    }*/
    public InstallationRequest(Customer customer, List<Product> requestedProducts, String preferredDate) {
        this.customer = customer;
        this.requestedProducts = requestedProducts;
        this.preferredDate = preferredDate;
    }

    public InstallationRequest() {

    }

    /*public InstallationRequest(String customer, String requestedProducts, String referredDate ) {
        this.customer = customer;
        this.requestedProducts = requestedProducts;
        this.preferredDate = preferredDate;
    }*/

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getRequestedProducts() {
        return requestedProducts;
    }

    public String getPreferredDate() {
        return preferredDate;
    }

    @Override
    public String toString() {
        return "Installation Request:\n" +
                "Customer: " + customer.getName() + "\n" +
                "Contact Info: " + customer.getContactInfo() + "\n" +
                "Requested Products: " + requestedProducts + "\n" +
                "Preferred Date: " + preferredDate;
    }
       /* // feature 2 instead of InstallationRequestSystem pending
public InstallationRequest(){}
    public List<InstallationRequest> pendingInstallationRequests;
    public void displayPendingInstallationRequests() {
        System.out.println(requestedProducts);

        /*for (InstallationRequest request : pendingInstallationRequests) {
            System.out.println(request);
        }
    }*/

    // f 3 instead of installationselection
    private static Product selectedProduct;

    public static void  selectProduct(Product product, int choice) {
        selectedProduct = product;
        System.out.println("Selected Product: " + selectedProduct.image +choice);
    }

    public static Product getSelectedProduct() {
        return selectedProduct;
    }

    // feature 3 instead of instalarionrequestform
    private String carMakeModel;

    public void fillForm(Product product) {
        this.carMakeModel = carMakeModel;
        this.preferredDate = preferredDate;
        System.out.println("Installation Request Form Filled:");
        System.out.println("product form: " + this.getCarMakeModel());
        System.out.println("Preferred Date: " + this.preferredDate);
    }
    public String getCarMakeModel() {
        return carMakeModel;
    }
}