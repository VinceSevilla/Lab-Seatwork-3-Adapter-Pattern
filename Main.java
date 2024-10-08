public class Main{
    public static void main(String[] args){
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        AttendanceSystemAdapter attendanceSystemSchoolManagementApp = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        GradingSystemAdapter gradingSystemSchoolManagementApp = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        LibrarySystemAdapter librarySystemSchoolManagementApp = new LibrarySystemAdapter(librarySystem);

        System.out.println(attendanceSystemSchoolManagementApp.integrateSystem());
        System.out.println(gradingSystemSchoolManagementApp.integrateSystem());
        System.out.println(librarySystemSchoolManagementApp.integrateSystem());
    }
}