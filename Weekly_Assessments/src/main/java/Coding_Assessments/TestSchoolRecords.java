package Coding_Assessments;

public class TestSchoolRecords {

	public static void main(String[] args) {
		SchoolRecords sr = new SchoolRecords();
		sr.addRecords(1001, "SNMS MATRIC SCHOOL", "TIRUVALLUR");
		sr.dispRecords();
		sr.addRecords(1002, "RMK MATRIC SCHOOL", "CHENNAI");
		sr.dispRecords();
		sr.addRecords(1003, "VELAMMAL MATRIC SCHOOL", "CHENNAI");
		sr.dispRecords();

	}

}
