package edu.osu.cse5234.business.inventorymanagement;

public class shippingInfo {
	 private int mId;
	    private String mStreetAddress;
	    private String mCity;
	    private String mZipCode;
	    private String mState;
	    private String mCountry;
	    private String mEmailAddress;
	    private String mShippingMethod;

	    public shippingInfo(int id, String streetAddress, String city,String zipCode , String state , String country ,String emailAddress ,String shippingMethod) {
	        this.mId = id;
	        this.mStreetAddress = streetAddress;
	        this.mCity = city;
	        this.mZipCode = zipCode;
	        this.mState = state;
	        this.mCountry = country;
	        this.mEmailAddress = emailAddress;
	        this.mShippingMethod = shippingMethod;
	    }

	    
	 
	    public int getmId() {
			return mId;
		}



		public void setmId(int mId) {
			this.mId = mId;
		}



		public String getmStreetAddress() {
			return mStreetAddress;
		}



		public void setmStreetAddress(String mStreetAddress) {
			this.mStreetAddress = mStreetAddress;
		}



		public String getmCity() {
			return mCity;
		}



		public void setmCity(String mCity) {
			this.mCity = mCity;
		}



		public String getmZipCode() {
			return mZipCode;
		}



		public void setmZipCode(String mZipCode) {
			this.mZipCode = mZipCode;
		}



		public String getmState() {
			return mState;
		}



		public void setmState(String mState) {
			this.mState = mState;
		}



		public String getmCountry() {
			return mCountry;
		}



		public void setmCountry(String mCountry) {
			this.mCountry = mCountry;
		}



		public String getmEmailAddress() {
			return mEmailAddress;
		}



		public void setmEmailAddress(String mEmailAddress) {
			this.mEmailAddress = mEmailAddress;
		}



		public String getmShippingMethod() {
			return mShippingMethod;
		}



		public void setmShippingMethod(String mShippingMethod) {
			this.mShippingMethod = mShippingMethod;
		}



		public void clear() {
	        this.mId = -1;
	        this.mStreetAddress = "";
	        this.mCity = "";
	        this.mZipCode = "";
	        this.mState = "";
	        this.mCountry = "";
	        this.mEmailAddress = "";
	        this.mShippingMethod = "";
	    }
}
