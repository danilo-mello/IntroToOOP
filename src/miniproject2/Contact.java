package miniproject2;

public class Contact {

  protected static int counter;
  private final Integer index;
  private String name;
  private String mobile;
  private String home;
  private String work;
  private String city;

  Contact(String name, String mobile, String work, String home, String city) {
    this.index = counter;
    this.name = name;
    this.mobile = mobile;
    this.work = work;
    this.home = home;
    this.city = city;
  }

  public Integer getIndex() {
    return index;
  }

  public String getName() {
    return name;
  }

  public String getMobile() {
    return mobile;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public void setHome(String home) {
    this.home = home;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString() {
    if (work.length() < 1 && home.length() < 1 && city.length() < 1) {
      return index + ". <" + name + "> (mobile=" + mobile + ")";
    } else if (home.length() < 1 && city.length() < 1) {
      return index + ". <" + name + "> (mobile=" + mobile + ", work=" + work + ")";
    } else if (work.length() < 1 && city.length() < 1) {
      return index + ". <" + name + "> (mobile=" + mobile + ", home=" + home + ")";
    } else if (work.length() < 1 && home.length() < 1) {
      return index + ". <" + name + "> (mobile=" + mobile + ", city=" + city + ")";
    } else if (city.length() < 1) {
      return index + ". <" + name + "> (mobile=" + mobile + ", work=" + work + ", home=" + home +
          ")";
    } else if (home.length() < 1) {
      return index + ". <" + name + "> (mobile=" + mobile + ", work=" + work + ", city=" + city +
          ")";
    } else if (work.length() < 1) {
      return index + ". <" + name + "> (mobile=" + mobile + ", home=" + home + ", city=" + city +
          ")";
    } else {
      return this.index + ". <" + name + "> (mobile=" + mobile + ", work=" + work + ", home=" +
          home + ", city=" + city + ")";
    }
  }

}