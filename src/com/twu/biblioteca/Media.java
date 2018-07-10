package com.twu.biblioteca;

public abstract class Media {
    public enum Status {
        AVAILABLE,
        CHECKED_OUT
    }

    protected Status status;
    protected String title;

    abstract String detailsString();

    public Media() {
        this.status = Status.AVAILABLE;
    }

    public Media.Status status() {
        return this.status;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isAvailable() {
        return status.equals(Media.Status.AVAILABLE);
    }

    public boolean isCheckedOut() {
        return status.equals(Media.Status.CHECKED_OUT);
    }

    public void checkoutItem() {
        if (this.status.equals(Status.AVAILABLE)) {
            this.status = Status.CHECKED_OUT;
        }
    }

    public void returnItem() {
        if (this.status.equals(Status.CHECKED_OUT)) {
            this.status = Status.AVAILABLE;
        }
    }
}
