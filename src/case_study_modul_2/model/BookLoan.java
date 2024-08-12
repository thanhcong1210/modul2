package case_study_modul_2.model;

import java.util.Objects;

public class BookLoan {

    private String userNameBorrowed;
    private String nameBookBorrowed;
    private String authorBookBorrowed;

    public BookLoan(){
    }

    public BookLoan(String userNameBorrowed, String nameBookBorrowed, String authorBookBorrowed) {
        this.userNameBorrowed = userNameBorrowed;
        this.nameBookBorrowed = nameBookBorrowed;
        this.authorBookBorrowed = authorBookBorrowed;
    }

    public String getUserNameBorrowed() {
        return userNameBorrowed;
    }

    public void setUserNameBorrowed(String userNameBorrowed) {
        this.userNameBorrowed = userNameBorrowed;
    }

    public String getNameBookBorrowed() {
        return nameBookBorrowed;
    }

    public void setNameBookBorrowed(String nameBookBorrowed) {
        this.nameBookBorrowed = nameBookBorrowed;
    }

    public String getAuthorBookBorrowed() {
        return authorBookBorrowed;
    }

    public void setAuthorBookBorrowed(String authorBookBorrowed) {
        this.authorBookBorrowed = authorBookBorrowed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        BookLoan bookLoan = (BookLoan) obj;
        return Objects.equals(userNameBorrowed, bookLoan.userNameBorrowed) &&
                Objects.equals(nameBookBorrowed, bookLoan.nameBookBorrowed) &&
                Objects.equals(authorBookBorrowed, bookLoan.authorBookBorrowed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userNameBorrowed, nameBookBorrowed, authorBookBorrowed);
    }


}
