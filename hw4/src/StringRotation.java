public class StringRotation {
	String rotate(String str, int num){
		char[] arr = str.toCharArray();
		char[] copyArr = new char[arr.length];
		int numBer;
		if(arr.length == 0){
			String resultStr = "";
			return resultStr;
		}else{
			
		if(num < 0){
			numBer = arr.length + num;
		}else if(num < arr.length+1){
			numBer = num;
		}else{
			numBer = num % arr.length;
		}
		System.arraycopy(arr, 0, copyArr, 0, arr.length);
		
		for(int i=0; i<(arr.length-numBer); i++){
			arr[i+numBer] = copyArr[i];
		}
		for(int j=0; j<numBer; j++){
			arr[j] = copyArr[arr.length-(numBer-j)];
		}

		String resultStr = new String(arr);
		return resultStr;
		}
	}

}