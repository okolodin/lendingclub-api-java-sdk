package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by tmichels on 12/8/14.
 */

public class Loan {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("memberId")
    private Integer memberId;
    @JsonProperty("loanAmount")
    private Number loanAmount;
    @JsonProperty("fundedAmount")
    private Number fundedAmount;
    @JsonProperty("term")
    private Integer term;
    @JsonProperty("intRate")
    private Number intRate;
    @JsonProperty("expDefaultRate")
    private Number expDefaultRate;
    @JsonProperty("serviceFeeRate")
    private Number serviceFeeRate;
    @JsonProperty("installment")
    private Number installment;
    @JsonProperty("grade")
    private String grade;
    @JsonProperty("subGrade")
    private String subGrade;
    @JsonProperty("empLength")
    private Integer empLength;
    @JsonProperty("homeOwnership")
    private String homeOwnership;
    @JsonProperty("annualInc")
    private Number annualInc;
    @JsonProperty("isIncV")
    private String isIncV;
    @JsonProperty("acceptD")
    private String acceptD;
    @JsonProperty("expD")
    private String expD;
    @JsonProperty("listD")
    private String listD;
    @JsonProperty("creditPullD")
    private String creditPullD;
    @JsonProperty("reviewStatusD")
    private String reviewStatusD;
    @JsonProperty("reviewStatus")
    private String reviewStatus;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("purpose")
    private String purpose;
    @JsonProperty("addrZip")
    private String addrZip;
    @JsonProperty("addrState")
    private String addrState;
    @JsonProperty("investorCount")
    private Integer investorCount;
    @JsonProperty("ilsExpD")
    private String ilsExpD;
    @JsonProperty("initialListStatus")
    private String initialListStatus;
    @JsonProperty("empTitle")
    private String empTitle;
    @JsonProperty("accNowDelinq")
    private Integer accNowDelinq;
    @JsonProperty("accOpenPast24Mths")
    private Integer accOpenPast24Mths;
    @JsonProperty("bcOpenToBuy")
    private Integer bcOpenToBuy;
    @JsonProperty("percentBcGt75")
    private Number percentBcGt75;
    @JsonProperty("bcUtil")
    private Number bcUtil;
    @JsonProperty("dti")
    private Number dti;
    @JsonProperty("delinq2Yrs")
    private Integer delinq2Yrs;
    @JsonProperty("delinqAmnt")
    private Number delinqAmnt;
    @JsonProperty("earliestCrLine")
    private String earliestCrLine;
    @JsonProperty("ficoRangeLow")
    private Integer ficoRangeLow;
    @JsonProperty("ficoRangeHigh")
    private Integer ficoRangeHigh;
    @JsonProperty("inqLast6Mths")
    private Integer inqLast6Mths;
    @JsonProperty("mthsSinceLastDelinq")
    private Integer mthsSinceLastDelinq;
    @JsonProperty("mthsSinceLastRecord")
    private Integer mthsSinceLastRecord;
    @JsonProperty("mthsSinceRecentInq")
    private Integer mthsSinceRecentInq;
    @JsonProperty("mthsSinceRecentRevolDelinq")
    private Integer mthsSinceRecentRevolDelinq;
    @JsonProperty("mthsSinceRecentBc")
    private Integer mthsSinceRecentBc;
    @JsonProperty("mortAcc")
    private Integer mortAcc;
    @JsonProperty("openAcc")
    private Integer openAcc;
    @JsonProperty("pubRec")
    private Integer pubRec;
    @JsonProperty("totalBalExMort")
    private Integer totalBalExMort;
    @JsonProperty("revolBal")
    private Number revolBal;
    @JsonProperty("revolUtil")
    private Number revolUtil;
    @JsonProperty("totalBcLimit")
    private Integer totalBcLimit;
    @JsonProperty("totalAcc")
    private Integer totalAcc;
    @JsonProperty("totalIlHighCreditLimit")
    private Integer totalIlHighCreditLimit;
    @JsonProperty("numRevAccts")
    private Integer numRevAccts;
    @JsonProperty("mthsSinceRecentBcDlq")
    private Integer mthsSinceRecentBcDlq;
    @JsonProperty("pubRecBankruptcies")
    private Integer pubRecBankruptcies;
    @JsonProperty("numAcctsEver120Ppd")
    private Integer numAcctsEver120Ppd;
    @JsonProperty("chargeoffWithin12Mths")
    private Integer chargeoffWithin12Mths;
    @JsonProperty("collections12MthsExMed")
    private Integer collections12MthsExMed;
    @JsonProperty("taxLiens")
    private Integer taxLiens;
    @JsonProperty("mthsSinceLastMajorDerog")
    private Integer mthsSinceLastMajorDerog;
    @JsonProperty("numSats")
    private Integer numSats;
    @JsonProperty("numTlOpPast12m")
    private Integer numTlOpPast12m;
    @JsonProperty("moSinRcntTl")
    private Integer moSinRcntTl;
    @JsonProperty("totHiCredLim")
    private Integer totHiCredLim;
    @JsonProperty("totCurBal")
    private Integer totCurBal;
    @JsonProperty("avgCurBal")
    private Integer avgCurBal;
    @JsonProperty("numBcTl")
    private Integer numBcTl;
    @JsonProperty("numActvBcTl")
    private Integer numActvBcTl;
    @JsonProperty("numBcSats")
    private Integer numBcSats;
    @JsonProperty("pctTlNvrDlq")
    private Integer pctTlNvrDlq;
    @JsonProperty("numTl90gDpd24m")
    private Integer numTl90gDpd24m;
    @JsonProperty("numTl30dpd")
    private Integer numTl30dpd;
    @JsonProperty("numTl120dpd2m")
    private Integer numTl120dpd2m;
    @JsonProperty("numIlTl")
    private Integer numIlTl;
    @JsonProperty("moSinOldIlAcct")
    private Integer moSinOldIlAcct;
    @JsonProperty("numActvRevTl")
    private Integer numActvRevTl;
    @JsonProperty("moSinOldRevTlOp")
    private Integer moSinOldRevTlOp;
    @JsonProperty("moSinRcntRevTlOp")
    private Integer moSinRcntRevTlOp;
    @JsonProperty("totalRevHiLim")
    private Integer totalRevHiLim;
    @JsonProperty("numRevTlBalGt0")
    private Integer numRevTlBalGt0;
    @JsonProperty("numOpRevTl")
    private Integer numOpRevTl;
    @JsonProperty("totCollAmt")
    private Integer totCollAmt;
    @JsonProperty("applicationType")
    private String applicationType;
    @JsonProperty("annualIncJoint")
    private Number annualIncJoint;
    @JsonProperty("dtiJoint")
    private Number dtiJoint;
    @JsonProperty("isIncVJoint")
    private String isIncVJoint;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Number getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Number loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Number getFundedAmount() {
        return fundedAmount;
    }

    public void setFundedAmount(Number fundedAmount) {
        this.fundedAmount = fundedAmount;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Number getIntRate() {
        return intRate;
    }

    public void setIntRate(Number intRate) {
        this.intRate = intRate;
    }

    public Number getExpDefaultRate() {
        return expDefaultRate;
    }

    public void setExpDefaultRate(Number expDefaultRate) {
        this.expDefaultRate = expDefaultRate;
    }

    public Number getServiceFeeRate() {
        return serviceFeeRate;
    }

    public void setServiceFeeRate(Number serviceFeeRate) {
        this.serviceFeeRate = serviceFeeRate;
    }

    public Number getInstallment() {
        return installment;
    }

    public void setInstallment(Number installment) {
        this.installment = installment;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubGrade() {
        return subGrade;
    }

    public void setSubGrade(String subGrade) {
        this.subGrade = subGrade;
    }

    public Integer getEmpLength() {
        return empLength;
    }

    public void setEmpLength(Integer empLength) {
        this.empLength = empLength;
    }

    public String getHomeOwnership() {
        return homeOwnership;
    }

    public void setHomeOwnership(String homeOwnership) {
        this.homeOwnership = homeOwnership;
    }

    public Number getAnnualInc() {
        return annualInc;
    }

    public void setAnnualInc(Number annualInc) {
        this.annualInc = annualInc;
    }

    public String getIsIncV() {
        return isIncV;
    }

    public void setIsIncV(String isIncV) {
        this.isIncV = isIncV;
    }

    public String getAcceptD() {
        return acceptD;
    }

    public void setAcceptD(String acceptD) {
        this.acceptD = acceptD;
    }

    public String getExpD() {
        return expD;
    }

    public void setExpD(String expD) {
        this.expD = expD;
    }

    public String getListD() {
        return listD;
    }

    public void setListD(String listD) {
        this.listD = listD;
    }

    public String getCreditPullD() {
        return creditPullD;
    }

    public void setCreditPullD(String creditPullD) {
        this.creditPullD = creditPullD;
    }

    public String getReviewStatusD() {
        return reviewStatusD;
    }

    public void setReviewStatusD(String reviewStatusD) {
        this.reviewStatusD = reviewStatusD;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getAddrZip() {
        return addrZip;
    }

    public void setAddrZip(String addrZip) {
        this.addrZip = addrZip;
    }

    public String getAddrState() {
        return addrState;
    }

    public void setAddrState(String addrState) {
        this.addrState = addrState;
    }

    public Integer getInvestorCount() {
        return investorCount;
    }

    public void setInvestorCount(Integer investorCount) {
        this.investorCount = investorCount;
    }

    public String getIlsExpD() {
        return ilsExpD;
    }

    public void setIlsExpD(String ilsExpD) {
        this.ilsExpD = ilsExpD;
    }

    public String getInitialListStatus() {
        return initialListStatus;
    }

    public void setInitialListStatus(String initialListStatus) {
        this.initialListStatus = initialListStatus;
    }

    public String getEmpTitle() {
        return empTitle;
    }

    public void setEmpTitle(String empTitle) {
        this.empTitle = empTitle;
    }

    public Integer getAccNowDelinq() {
        return accNowDelinq;
    }

    public void setAccNowDelinq(Integer accNowDelinq) {
        this.accNowDelinq = accNowDelinq;
    }

    public Integer getAccOpenPast24Mths() {
        return accOpenPast24Mths;
    }

    public void setAccOpenPast24Mths(Integer accOpenPast24Mths) {
        this.accOpenPast24Mths = accOpenPast24Mths;
    }

    public Integer getBcOpenToBuy() {
        return bcOpenToBuy;
    }

    public void setBcOpenToBuy(Integer bcOpenToBuy) {
        this.bcOpenToBuy = bcOpenToBuy;
    }

    public Number getPercentBcGt75() {
        return percentBcGt75;
    }

    public void setPercentBcGt75(Number percentBcGt75) {
        this.percentBcGt75 = percentBcGt75;
    }

    public Number getBcUtil() {
        return bcUtil;
    }

    public void setBcUtil(Number bcUtil) {
        this.bcUtil = bcUtil;
    }

    public Number getDti() {
        return dti;
    }

    public void setDti(Number dti) {
        this.dti = dti;
    }

    public Integer getDelinq2Yrs() {
        return delinq2Yrs;
    }

    public void setDelinq2Yrs(Integer delinq2Yrs) {
        this.delinq2Yrs = delinq2Yrs;
    }

    public Number getDelinqAmnt() {
        return delinqAmnt;
    }

    public void setDelinqAmnt(Number delinqAmnt) {
        this.delinqAmnt = delinqAmnt;
    }

    public String getEarliestCrLine() {
        return earliestCrLine;
    }

    public void setEarliestCrLine(String earliestCrLine) {
        this.earliestCrLine = earliestCrLine;
    }

    public Integer getFicoRangeLow() {
        return ficoRangeLow;
    }

    public void setFicoRangeLow(Integer ficoRangeLow) {
        this.ficoRangeLow = ficoRangeLow;
    }

    public Integer getFicoRangeHigh() {
        return ficoRangeHigh;
    }

    public void setFicoRangeHigh(Integer ficoRangeHigh) {
        this.ficoRangeHigh = ficoRangeHigh;
    }

    public Integer getInqLast6Mths() {
        return inqLast6Mths;
    }

    public void setInqLast6Mths(Integer inqLast6Mths) {
        this.inqLast6Mths = inqLast6Mths;
    }

    public Integer getMthsSinceLastDelinq() {
        return mthsSinceLastDelinq;
    }

    public void setMthsSinceLastDelinq(Integer mthsSinceLastDelinq) {
        this.mthsSinceLastDelinq = mthsSinceLastDelinq;
    }

    public Integer getMthsSinceLastRecord() {
        return mthsSinceLastRecord;
    }

    public void setMthsSinceLastRecord(Integer mthsSinceLastRecord) {
        this.mthsSinceLastRecord = mthsSinceLastRecord;
    }

    public Integer getMthsSinceRecentInq() {
        return mthsSinceRecentInq;
    }

    public void setMthsSinceRecentInq(Integer mthsSinceRecentInq) {
        this.mthsSinceRecentInq = mthsSinceRecentInq;
    }

    public Integer getMthsSinceRecentRevolDelinq() {
        return mthsSinceRecentRevolDelinq;
    }

    public void setMthsSinceRecentRevolDelinq(Integer mthsSinceRecentRevolDelinq) {
        this.mthsSinceRecentRevolDelinq = mthsSinceRecentRevolDelinq;
    }

    public Integer getMthsSinceRecentBc() {
        return mthsSinceRecentBc;
    }

    public void setMthsSinceRecentBc(Integer mthsSinceRecentBc) {
        this.mthsSinceRecentBc = mthsSinceRecentBc;
    }

    public Integer getMortAcc() {
        return mortAcc;
    }

    public void setMortAcc(Integer mortAcc) {
        this.mortAcc = mortAcc;
    }

    public Integer getOpenAcc() {
        return openAcc;
    }

    public void setOpenAcc(Integer openAcc) {
        this.openAcc = openAcc;
    }

    public Integer getPubRec() {
        return pubRec;
    }

    public void setPubRec(Integer pubRec) {
        this.pubRec = pubRec;
    }

    public Integer getTotalBalExMort() {
        return totalBalExMort;
    }

    public void setTotalBalExMort(Integer totalBalExMort) {
        this.totalBalExMort = totalBalExMort;
    }

    public Number getRevolBal() {
        return revolBal;
    }

    public void setRevolBal(Number revolBal) {
        this.revolBal = revolBal;
    }

    public Number getRevolUtil() {
        return revolUtil;
    }

    public void setRevolUtil(Number revolUtil) {
        this.revolUtil = revolUtil;
    }

    public Integer getTotalBcLimit() {
        return totalBcLimit;
    }

    public void setTotalBcLimit(Integer totalBcLimit) {
        this.totalBcLimit = totalBcLimit;
    }

    public Integer getTotalAcc() {
        return totalAcc;
    }

    public void setTotalAcc(Integer totalAcc) {
        this.totalAcc = totalAcc;
    }

    public Integer getTotalIlHighCreditLimit() {
        return totalIlHighCreditLimit;
    }

    public void setTotalIlHighCreditLimit(Integer totalIlHighCreditLimit) {
        this.totalIlHighCreditLimit = totalIlHighCreditLimit;
    }

    public Integer getNumRevAccts() {
        return numRevAccts;
    }

    public void setNumRevAccts(Integer numRevAccts) {
        this.numRevAccts = numRevAccts;
    }

    public Integer getMthsSinceRecentBcDlq() {
        return mthsSinceRecentBcDlq;
    }

    public void setMthsSinceRecentBcDlq(Integer mthsSinceRecentBcDlq) {
        this.mthsSinceRecentBcDlq = mthsSinceRecentBcDlq;
    }

    public Integer getPubRecBankruptcies() {
        return pubRecBankruptcies;
    }

    public void setPubRecBankruptcies(Integer pubRecBankruptcies) {
        this.pubRecBankruptcies = pubRecBankruptcies;
    }

    public Integer getNumAcctsEver120Ppd() {
        return numAcctsEver120Ppd;
    }

    public void setNumAcctsEver120Ppd(Integer numAcctsEver120Ppd) {
        this.numAcctsEver120Ppd = numAcctsEver120Ppd;
    }

    public Integer getChargeoffWithin12Mths() {
        return chargeoffWithin12Mths;
    }

    public void setChargeoffWithin12Mths(Integer chargeoffWithin12Mths) {
        this.chargeoffWithin12Mths = chargeoffWithin12Mths;
    }

    public Integer getCollections12MthsExMed() {
        return collections12MthsExMed;
    }

    public void setCollections12MthsExMed(Integer collections12MthsExMed) {
        this.collections12MthsExMed = collections12MthsExMed;
    }

    public Integer getTaxLiens() {
        return taxLiens;
    }

    public void setTaxLiens(Integer taxLiens) {
        this.taxLiens = taxLiens;
    }

    public Integer getMthsSinceLastMajorDerog() {
        return mthsSinceLastMajorDerog;
    }

    public void setMthsSinceLastMajorDerog(Integer mthsSinceLastMajorDerog) {
        this.mthsSinceLastMajorDerog = mthsSinceLastMajorDerog;
    }

    public Integer getNumSats() {
        return numSats;
    }

    public void setNumSats(Integer numSats) {
        this.numSats = numSats;
    }

    public Integer getNumTlOpPast12m() {
        return numTlOpPast12m;
    }

    public void setNumTlOpPast12m(Integer numTlOpPast12m) {
        this.numTlOpPast12m = numTlOpPast12m;
    }

    public Integer getMoSinRcntTl() {
        return moSinRcntTl;
    }

    public void setMoSinRcntTl(Integer moSinRcntTl) {
        this.moSinRcntTl = moSinRcntTl;
    }

    public Integer getTotHiCredLim() {
        return totHiCredLim;
    }

    public void setTotHiCredLim(Integer totHiCredLim) {
        this.totHiCredLim = totHiCredLim;
    }

    public Integer getTotCurBal() {
        return totCurBal;
    }

    public void setTotCurBal(Integer totCurBal) {
        this.totCurBal = totCurBal;
    }

    public Integer getAvgCurBal() {
        return avgCurBal;
    }

    public void setAvgCurBal(Integer avgCurBal) {
        this.avgCurBal = avgCurBal;
    }

    public Integer getNumBcTl() {
        return numBcTl;
    }

    public void setNumBcTl(Integer numBcTl) {
        this.numBcTl = numBcTl;
    }

    public Integer getNumActvBcTl() {
        return numActvBcTl;
    }

    public void setNumActvBcTl(Integer numActvBcTl) {
        this.numActvBcTl = numActvBcTl;
    }

    public Integer getNumBcSats() {
        return numBcSats;
    }

    public void setNumBcSats(Integer numBcSats) {
        this.numBcSats = numBcSats;
    }

    public Integer getPctTlNvrDlq() {
        return pctTlNvrDlq;
    }

    public void setPctTlNvrDlq(Integer pctTlNvrDlq) {
        this.pctTlNvrDlq = pctTlNvrDlq;
    }

    public Integer getNumTl90gDpd24m() {
        return numTl90gDpd24m;
    }

    public void setNumTl90gDpd24m(Integer numTl90gDpd24m) {
        this.numTl90gDpd24m = numTl90gDpd24m;
    }

    public Integer getNumTl30dpd() {
        return numTl30dpd;
    }

    public void setNumTl30dpd(Integer numTl30dpd) {
        this.numTl30dpd = numTl30dpd;
    }

    public Integer getNumTl120dpd2m() {
        return numTl120dpd2m;
    }

    public void setNumTl120dpd2m(Integer numTl120dpd2m) {
        this.numTl120dpd2m = numTl120dpd2m;
    }

    public Integer getNumIlTl() {
        return numIlTl;
    }

    public void setNumIlTl(Integer numIlTl) {
        this.numIlTl = numIlTl;
    }

    public Integer getMoSinOldIlAcct() {
        return moSinOldIlAcct;
    }

    public void setMoSinOldIlAcct(Integer moSinOldIlAcct) {
        this.moSinOldIlAcct = moSinOldIlAcct;
    }

    public Integer getNumActvRevTl() {
        return numActvRevTl;
    }

    public void setNumActvRevTl(Integer numActvRevTl) {
        this.numActvRevTl = numActvRevTl;
    }

    public Integer getMoSinOldRevTlOp() {
        return moSinOldRevTlOp;
    }

    public void setMoSinOldRevTlOp(Integer moSinOldRevTlOp) {
        this.moSinOldRevTlOp = moSinOldRevTlOp;
    }

    public Integer getMoSinRcntRevTlOp() {
        return moSinRcntRevTlOp;
    }

    public void setMoSinRcntRevTlOp(Integer moSinRcntRevTlOp) {
        this.moSinRcntRevTlOp = moSinRcntRevTlOp;
    }

    public Integer getTotalRevHiLim() {
        return totalRevHiLim;
    }

    public void setTotalRevHiLim(Integer totalRevHiLim) {
        this.totalRevHiLim = totalRevHiLim;
    }

    public Integer getNumRevTlBalGt0() {
        return numRevTlBalGt0;
    }

    public void setNumRevTlBalGt0(Integer numRevTlBalGt0) {
        this.numRevTlBalGt0 = numRevTlBalGt0;
    }

    public Integer getNumOpRevTl() {
        return numOpRevTl;
    }

    public void setNumOpRevTl(Integer numOpRevTl) {
        this.numOpRevTl = numOpRevTl;
    }

    public Integer getTotCollAmt() {
        return totCollAmt;
    }

    public void setTotCollAmt(Integer totCollAmt) {
        this.totCollAmt = totCollAmt;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }


    public Number getDtiJoint() {
        return dtiJoint;
    }

    public void setDtiJoint(Number dtiJoint) {
        this.dtiJoint = dtiJoint;
    }

    public String getIsIncVJoint() {
        return isIncVJoint;
    }

    public void setIsIncVJoint(String isIncVJoint) {
        this.isIncVJoint = isIncVJoint;
    }

    public Number getAnnualIncJoint() {
        return annualIncJoint;
    }

    public void setAnnualIncJoint(Number annualIncJoint) {
        this.annualIncJoint = annualIncJoint;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", memberId=" + memberId +
                ", loanAmount=" + loanAmount +
                ", fundedAmount=" + fundedAmount +
                ", term=" + term +
                ", intRate=" + intRate +
                ", expDefaultRate=" + expDefaultRate +
                ", serviceFeeRate=" + serviceFeeRate +
                ", installment=" + installment +
                ", grade='" + grade + '\'' +
                ", subGrade='" + subGrade + '\'' +
                ", empLength=" + empLength +
                ", homeOwnership='" + homeOwnership + '\'' +
                ", annualInc=" + annualInc +
                ", isIncV='" + isIncV + '\'' +
                ", acceptD='" + acceptD + '\'' +
                ", expD='" + expD + '\'' +
                ", listD='" + listD + '\'' +
                ", creditPullD='" + creditPullD + '\'' +
                ", reviewStatusD='" + reviewStatusD + '\'' +
                ", reviewStatus='" + reviewStatus + '\'' +
                ", desc='" + desc + '\'' +
                ", purpose='" + purpose + '\'' +
                ", addrZip='" + addrZip + '\'' +
                ", addrState='" + addrState + '\'' +
                ", investorCount=" + investorCount +
                ", ilsExpD='" + ilsExpD + '\'' +
                ", initialListStatus='" + initialListStatus + '\'' +
                ", empTitle='" + empTitle + '\'' +
                ", accNowDelinq=" + accNowDelinq +
                ", accOpenPast24Mths=" + accOpenPast24Mths +
                ", bcOpenToBuy=" + bcOpenToBuy +
                ", percentBcGt75=" + percentBcGt75 +
                ", bcUtil=" + bcUtil +
                ", dti=" + dti +
                ", delinq2Yrs=" + delinq2Yrs +
                ", delinqAmnt=" + delinqAmnt +
                ", earliestCrLine='" + earliestCrLine + '\'' +
                ", ficoRangeLow=" + ficoRangeLow +
                ", ficoRangeHigh=" + ficoRangeHigh +
                ", inqLast6Mths=" + inqLast6Mths +
                ", mthsSinceLastDelinq=" + mthsSinceLastDelinq +
                ", mthsSinceLastRecord=" + mthsSinceLastRecord +
                ", mthsSinceRecentInq=" + mthsSinceRecentInq +
                ", mthsSinceRecentRevolDelinq=" + mthsSinceRecentRevolDelinq +
                ", mthsSinceRecentBc=" + mthsSinceRecentBc +
                ", mortAcc=" + mortAcc +
                ", openAcc=" + openAcc +
                ", pubRec=" + pubRec +
                ", totalBalExMort=" + totalBalExMort +
                ", revolBal=" + revolBal +
                ", revolUtil=" + revolUtil +
                ", totalBcLimit=" + totalBcLimit +
                ", totalAcc=" + totalAcc +
                ", totalIlHighCreditLimit=" + totalIlHighCreditLimit +
                ", numRevAccts=" + numRevAccts +
                ", mthsSinceRecentBcDlq=" + mthsSinceRecentBcDlq +
                ", pubRecBankruptcies=" + pubRecBankruptcies +
                ", numAcctsEver120Ppd=" + numAcctsEver120Ppd +
                ", chargeoffWithin12Mths=" + chargeoffWithin12Mths +
                ", collections12MthsExMed=" + collections12MthsExMed +
                ", taxLiens=" + taxLiens +
                ", mthsSinceLastMajorDerog=" + mthsSinceLastMajorDerog +
                ", numSats=" + numSats +
                ", numTlOpPast12m=" + numTlOpPast12m +
                ", moSinRcntTl=" + moSinRcntTl +
                ", totHiCredLim=" + totHiCredLim +
                ", totCurBal=" + totCurBal +
                ", avgCurBal=" + avgCurBal +
                ", numBcTl=" + numBcTl +
                ", numActvBcTl=" + numActvBcTl +
                ", numBcSats=" + numBcSats +
                ", pctTlNvrDlq=" + pctTlNvrDlq +
                ", numTl90gDpd24m=" + numTl90gDpd24m +
                ", numTl30dpd=" + numTl30dpd +
                ", numTl120dpd2m=" + numTl120dpd2m +
                ", numIlTl=" + numIlTl +
                ", moSinOldIlAcct=" + moSinOldIlAcct +
                ", numActvRevTl=" + numActvRevTl +
                ", moSinOldRevTlOp=" + moSinOldRevTlOp +
                ", moSinRcntRevTlOp=" + moSinRcntRevTlOp +
                ", totalRevHiLim=" + totalRevHiLim +
                ", numRevTlBalGt0=" + numRevTlBalGt0 +
                ", numOpRevTl=" + numOpRevTl +
                ", totCollAmt=" + totCollAmt +
                ", applicationType='" + applicationType + '\'' +
                ", annualIncLjoint=" + annualIncJoint +
                ", dtiJoint=" + dtiJoint +
                ", isIncVJoint='" + isIncVJoint + '\'' +
                '}';
    }
}
