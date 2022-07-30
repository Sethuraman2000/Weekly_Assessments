package Coding_Assessments;

public class SchoolRecords {
	int schoolID;
	String schoolName;
	String schoolAddress;
	String schoolDetails;

	void addRecords(int schoolID, String schoolName, String schoolAddress) {
		schoolDetails = schoolID + " - " + schoolName + " - " + schoolAddress;
	}

	void dispRecords() {
		System.out.println(schoolDetails);
	}

}
