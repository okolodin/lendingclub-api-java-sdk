package com.lendingclub.rest.util;

import com.lendingclub.model.folio.Listing;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Kolodin on 8/5/18.
 */
public class CsvUtils {

    public enum ListingHeaders {
        noteId, outstandingPrincipal, accruedInterest, loanStatus, price, markupOrDiscount, yieldToMaturity,
        daysSinceLastPayment, creditScoreTrend, ficoEndRangeHigh, ficoEndRangeLow, listingStartDate, expirationDate,
        isNeverLate, subGrade, term, originalNoteAmount, interestRate, remainingPayments, applicationType
    }

    public static List<Listing> parseFolioListings(InputStream csvStream) throws IOException {
        List<Listing> result = new ArrayList<>();
        Reader in = new InputStreamReader(csvStream);

        CSVParser parser = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);

        for (CSVRecord record : parser) {
            Listing listing = new Listing();
            listing.setNoteId(record.get(ListingHeaders.noteId));
            listing.setOutstandingPrincipal(record.get(ListingHeaders.outstandingPrincipal));
            listing.setAccruedInterest(record.get(ListingHeaders.accruedInterest));
            listing.setLoanStatus(record.get(ListingHeaders.loanStatus));
            listing.setPrice(record.get(ListingHeaders.price));
            listing.setMarkupOrDiscount(record.get(ListingHeaders.markupOrDiscount));
            listing.setYieldToMaturity(record.get(ListingHeaders.yieldToMaturity));
            listing.setDaysSinceLastPayment(record.get(ListingHeaders.daysSinceLastPayment));
            listing.setCreditScoreTrend(record.get(ListingHeaders.creditScoreTrend));
            listing.setFicoEndRangeHigh(record.get(ListingHeaders.ficoEndRangeHigh));
            listing.setFicoEndRangeLow(record.get(ListingHeaders.ficoEndRangeLow));
            listing.setListingStartDate(record.get(ListingHeaders.listingStartDate));
            listing.setExpirationDate(record.get(ListingHeaders.expirationDate));
            listing.setIsNeverLate(record.get(ListingHeaders.isNeverLate));
            listing.setSubGrade(record.get(ListingHeaders.subGrade));
            listing.setTerm(record.get(ListingHeaders.term));
            listing.setOriginalNoteAmount(record.get(ListingHeaders.originalNoteAmount));
            listing.setInterestRate(record.get(ListingHeaders.interestRate));
            listing.setRemainingPayments(record.get(ListingHeaders.remainingPayments));
            listing.setApplicationType(record.get(ListingHeaders.applicationType));

            result.add(listing);
        }
        return result;
    }
}
