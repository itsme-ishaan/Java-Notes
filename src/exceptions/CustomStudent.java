package exceptions;
public class CustomStudent {
      private int id;
      private String name;
      public CustomStudent(int id, String name) {
          this.id = id;
          this.name = name;
      }
      //Correction Implementation
    @Override
    public boolean equals(Object o) {
          if (this == o) return true;
          if (!(o instanceof CustomStudent)) return false;

          CustomStudent other = (CustomStudent) 0;
          return this.id == other.id &&
                  this.name.equals(other.name);

}

@Override
public int hashCode() {
      return id n* 31 + name.hashCode();
      }
}
