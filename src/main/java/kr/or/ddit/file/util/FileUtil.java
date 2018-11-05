package kr.or.ddit.file.util;

public class FileUtil {
	

	// orginameFileName 을 통해 얻어올수 있다.
	// FileUtil.getFileExt(String fileName);
	// 확장자가 있을경우 .을 포함한 확장자 값을 리턴
	// 확장자가 없을경우 "" whitespace를 리턴
	// 테스트 값 :  sally.png --> .png
	// 테스트 값 :  sally --> ""
	
	
	/**
	 * Method : getFileExt
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : 파일 확장자 추출
	 */
	public static String getFileExt(String fileName) {
	// 방법 1
	/*	String[] split = fileName.split("\\.");
		if(split.length ==1) // 1 이면 확장자가 없다는 뜻
			return "";
		else                // 확장자가 있으면 ?? 
			return "." + split[split.length-1];  
	}*/
	
     // 방법 2
	 int lastDotIndex = fileName.lastIndexOf(".");
	 if(lastDotIndex<0)
		 return "";
	 else 
		 return fileName.substring(lastDotIndex);
	}
}	
