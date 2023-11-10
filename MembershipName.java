@Value
	public static class MembershipName {
		public MembershipName(String value) {
			this.nameValue = value;
		}

		String nameValue;
	}
	@Value
	public static class MembershipEmail {
		public MembershipEmail(String value) {
			this.emailValue = value;
		}
		String emailValue;
	}

	@Value
	public static class MembershipAddress {
		public MembershipAddress(String value) {
			this.addressValue = value;
		}
		String addressValue;
	}

	@Value
	public static class MembershipIsValid {
		public MembershipIsValid(boolean value) {
			this.isValidValue = value;
		}
		boolean isValidValue;
	}

	@Value
	public static class MembershipAggregateIdentifier {
		public MembershipAggregateIdentifier(String value) {
			this.aggregateIdentifier = value;
		}
		String aggregateIdentifier;
	}