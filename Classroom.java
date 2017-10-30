class Classroom {
  private Student[] classroom;

  public Classroom() {
    this.classroom = new Student[20];
  }

  public int studentCount() {
    int count = 0;
    for(Student student : classroom) {
      if(student != null) {
        count++;
      }
    }
    return count;
  }

  public void add(Student student) {
    int studentCount = studentCount();
    classroom[studentCount] = student;
  }
}
