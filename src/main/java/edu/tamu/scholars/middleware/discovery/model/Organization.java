package edu.tamu.scholars.middleware.discovery.model;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import java.util.List;

import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import com.fasterxml.jackson.annotation.JsonInclude;

import edu.tamu.scholars.middleware.harvest.annotation.Source;

@JsonInclude(NON_EMPTY)
//@formatter:off
@Source(
  key = "organization.class",
  sparql = {
      @Source.Sparql(
          template = "organization/organization",
          properties = {
              @Source.Property(name = "name", key = "organization.name"),
              @Source.Property(name = "abbreviation", key = "organization.abbreviation"),
              @Source.Property(name = "type", key = "organization.type", parse = true),
              @Source.Property(name = "overview", key = "organization.overview")
          }
      ),
      @Source.Sparql(
          template = "organization/website",
          properties = {
              @Source.Property(name = "websiteUrl", key = "organization.website.url"),
              @Source.Property(name = "websiteLabel", key = "organization.website.label")
          }
      ),
      @Source.Sparql(
          template = "organization/date",
          properties = {
              @Source.Property(name = "date", key = "organization.date")
          }
      ),
      @Source.Sparql(
          template = "organization/image",
          properties = {
              @Source.Property(name = "imageFilename", key = "organization.image.filename"),
              @Source.Property(name = "imageMimeType", key = "organization.image.mimeType"),
              @Source.Property(name = "imageId", key = "organization.image.downloadLocation", parse = true)
          }
      ),
      @Source.Sparql(
          template = "organization/address",
          properties = {
              @Source.Property(name = "postalCode", key = "organization.address.postalCode"),
              @Source.Property(name = "region", key = "organization.address.region"),
              @Source.Property(name = "streetAddress", key = "organization.address.streetAddress"),
              @Source.Property(name = "locality", key = "organization.address.locality"),
              @Source.Property(name = "country", key = "organization.address.country")
          }
      ),
      @Source.Sparql(
          template = "organization/email",
          properties = {
              @Source.Property(name = "email", key = "organization.email")
          }
      ),
      @Source.Sparql(
          template = "organization/geographicLocation",
          properties = {
              @Source.Property(name = "geographicLocation", key = "organization.geographicLocation")
          }
      ),
      @Source.Sparql(
          template = "organization/successorOrganization",
          properties = {
              @Source.Property(name = "successorOrganization", key = "organization.successorOrganization", id = "successorOrganizationId")
          }
      ),
      @Source.Sparql(
          template = "organization/predecessorOrganization",
          properties = {
              @Source.Property(name = "predecessorOrganization", key = "organization.predecessorOrganization", id = "predecessorOrganizationId")
          }
      ),
      @Source.Sparql(
          template = "organization/researchArea",
          properties = {
              @Source.Property(name = "researchArea", key = "organization.researchArea", id = "researchAreaId")
          }
      ),
      @Source.Sparql(
          template = "organization/people",
          properties = {
              @Source.Property(name = "people", key = "organization.people.name", id = "peopleId"),
              @Source.Property(name = "peopleTitle", key = "organization.people.title"),
              @Source.Property(name = "peopleType", key = "organization.people.type", parse = true)
          }
      )
  }
)
//@formatter:on
@SolrDocument(collection = "organizations")
public class Organization extends AbstractSolrDocument {

    @Indexed
    private String imageFilename;

    @Indexed
    private String imageMimeType;

    @Indexed
    private String imageId;

    @Indexed
    private String name;

    @Indexed
    private List<String> type;

    @Indexed
    private List<String> websiteUrl;

    @Indexed
    private List<String> websiteLabel;

    @Indexed
    private String overview;

    @Indexed
    private List<String> offersDegree;

    @Indexed
    private List<String> offersDegreeField;

    @Indexed
    private List<String> offersDegreeId;

    @Indexed
    private String abbreviation;

    @Indexed(type = "pdate")
    private List<String> date;

    @Indexed
    private List<String> sponsorsAwardOrHonor;

    @Indexed
    private List<String> sponsorsAwardOrHonorId;

    @Indexed
    private List<String> awardOrHonorGiven;

    @Indexed
    private List<String> awardOrHonorGivenId;

    @Indexed
    private List<String> awardOrHonorReceived;

    @Indexed
    private List<String> awardOrHonorReceiveds;

    @Indexed
    private List<String> keyword;

    @Indexed
    private List<String> organizationForTraining;

    @Indexed
    private List<String> organizationForTrainingId;

    @Indexed
    private List<String> people;

    @Indexed
    private List<String> peopleType;

    @Indexed
    private List<String> peopleTitle;

    @Indexed
    private List<String> peopleId;

    @Indexed
    private List<String> hasSubOrganization;

    @Indexed
    private List<String> hasSubOrganizationId;

    @Indexed
    private List<String> organizationWithin;

    @Indexed
    private List<String> organizationWithinId;

    @Indexed
    private List<String> leadOrganizationOf;

    @Indexed
    private List<String> leadOrganizationOfId;

    @Indexed
    private List<String> hasCollaboratingOrganizatgionOrGroup;

    @Indexed
    private List<String> hasCollaboratingOrganizatgionOrGroupId;

    @Indexed
    private List<String> hasAffiliatedOrganization;

    @Indexed
    private List<String> hasAffiliatedOrganizationId;

    @Indexed
    private List<String> memberOf;

    @Indexed
    private List<String> memberOfId;

    @Indexed
    private List<String> clinicalActivity;

    @Indexed
    private List<String> clinicalActivityId;

    @Indexed
    private List<String> convenerOfEvent;

    @Indexed
    private List<String> convenerOfEventId;

    @Indexed
    private List<String> attendedEvent;

    @Indexed
    private List<String> attendedEventId;

    @Indexed
    private List<String> selectedPublication;

    @Indexed
    private List<String> selectedPublicationId;

    @Indexed
    private List<String> publisherOf;

    @Indexed
    private List<String> publisherOfId;

    @Indexed
    private List<String> presentation;

    @Indexed
    private List<String> presentationId;

    @Indexed
    private List<String> featuredIn;

    @Indexed
    private List<String> featuredInId;

    @Indexed
    private List<String> assigneeForPatent;

    @Indexed
    private List<String> assigneeForPatentId;

    @Indexed
    private List<String> translatorOf;

    @Indexed
    private List<String> translatorOfId;

    @Indexed
    private List<String> awardsGrant;

    @Indexed
    private List<String> awardsGrantId;

    @Indexed
    private List<String> administersGrant;

    @Indexed
    private List<String> administersGrants;

    @Indexed
    private List<String> subcontractsGrant;

    @Indexed
    private List<String> subcontractsGrantId;

    @Indexed
    private List<String> performHumanStudy;

    @Indexed
    private List<String> performHumanStudyId;

    @Indexed
    private List<String> contractOrProviderForService;

    @Indexed
    private List<String> contractOrProviderForServiceId;

    @Indexed
    private List<String> outreachAndCommunityServiceActivity;

    @Indexed
    private List<String> outreachAndCommunityServiceActivityId;

    @Indexed
    private List<String> hasEquipment;

    @Indexed
    private List<String> hasEquipmentId;

    @Indexed
    private List<String> offersCource;

    @Indexed
    private List<String> offersCourceId;

    @Indexed
    private String orgId;

    @Indexed
    private List<String> sameAs;

    @Indexed
    private String phone;

    @Indexed
    private String fax;

    @Indexed
    private String emailAddress;

    @Indexed
    private String streetAddress;

    @Indexed
    private String locality;

    @Indexed
    private String region;

    @Indexed
    private String postalCode;

    @Indexed
    private String country;

    @Indexed(type = "location")
    private String geographicLocation;

    @Indexed
    private List<String> locatedAtFacility;

    @Indexed
    private List<String> locatedAtFacilityId;

    @Indexed
    private List<String> predecessorOrganization;

    @Indexed
    private List<String> predecessorOrganizationId;

    @Indexed
    private List<String> successorOrganization;

    @Indexed
    private List<String> successorOrganizationId;

    @Indexed
    private List<String> governingAuthorityFor;

    @Indexed
    private List<String> governingAuthorityForId;

    // NOTE: unidirectional from Concept vivo:researchAreaOf
    @Indexed
    private List<String> researchArea;

    @Indexed
    private List<String> researchAreaId;

    public String getImageFilename() {
        return imageFilename;
    }

    public void setImageFilename(String imageFilename) {
        this.imageFilename = imageFilename;
    }

    public String getImageMimeType() {
        return imageMimeType;
    }

    public void setImageMimeType(String imageMimeType) {
        this.imageMimeType = imageMimeType;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public List<String> getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(List<String> websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public List<String> getWebsiteLabel() {
        return websiteLabel;
    }

    public void setWebsiteLabel(List<String> websiteLabel) {
        this.websiteLabel = websiteLabel;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public List<String> getOffersDegree() {
        return offersDegree;
    }

    public void setOffersDegree(List<String> offersDegree) {
        this.offersDegree = offersDegree;
    }

    public List<String> getOffersDegreeField() {
        return offersDegreeField;
    }

    public void setOffersDegreeField(List<String> offersDegreeField) {
        this.offersDegreeField = offersDegreeField;
    }

    public List<String> getOffersDegreeId() {
        return offersDegreeId;
    }

    public void setOffersDegreeId(List<String> offersDegreeId) {
        this.offersDegreeId = offersDegreeId;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public List<String> getDate() {
        return date;
    }

    public void setDate(List<String> date) {
        this.date = date;
    }

    public List<String> getSponsorsAwardOrHonor() {
        return sponsorsAwardOrHonor;
    }

    public void setSponsorsAwardOrHonor(List<String> sponsorsAwardOrHonor) {
        this.sponsorsAwardOrHonor = sponsorsAwardOrHonor;
    }

    public List<String> getSponsorsAwardOrHonorId() {
        return sponsorsAwardOrHonorId;
    }

    public void setSponsorsAwardOrHonorId(List<String> sponsorsAwardOrHonorId) {
        this.sponsorsAwardOrHonorId = sponsorsAwardOrHonorId;
    }

    public List<String> getAwardOrHonorGiven() {
        return awardOrHonorGiven;
    }

    public void setAwardOrHonorGiven(List<String> awardOrHonorGiven) {
        this.awardOrHonorGiven = awardOrHonorGiven;
    }

    public List<String> getAwardOrHonorGivenId() {
        return awardOrHonorGivenId;
    }

    public void setAwardOrHonorGivenId(List<String> awardOrHonorGivenId) {
        this.awardOrHonorGivenId = awardOrHonorGivenId;
    }

    public List<String> getAwardOrHonorReceived() {
        return awardOrHonorReceived;
    }

    public void setAwardOrHonorReceived(List<String> awardOrHonorReceived) {
        this.awardOrHonorReceived = awardOrHonorReceived;
    }

    public List<String> getAwardOrHonorReceiveds() {
        return awardOrHonorReceiveds;
    }

    public void setAwardOrHonorReceiveds(List<String> awardOrHonorReceiveds) {
        this.awardOrHonorReceiveds = awardOrHonorReceiveds;
    }

    public List<String> getKeyword() {
        return keyword;
    }

    public void setKeyword(List<String> keyword) {
        this.keyword = keyword;
    }

    public List<String> getOrganizationForTraining() {
        return organizationForTraining;
    }

    public void setOrganizationForTraining(List<String> organizationForTraining) {
        this.organizationForTraining = organizationForTraining;
    }

    public List<String> getOrganizationForTrainingId() {
        return organizationForTrainingId;
    }

    public void setOrganizationForTrainingId(List<String> organizationForTrainingId) {
        this.organizationForTrainingId = organizationForTrainingId;
    }

    public List<String> getPeople() {
        return people;
    }

    public void setPeople(List<String> people) {
        this.people = people;
    }

    public List<String> getPeopleType() {
        return peopleType;
    }

    public void setPeopleType(List<String> peopleType) {
        this.peopleType = peopleType;
    }

    public List<String> getPeopleTitle() {
        return peopleTitle;
    }

    public void setPeopleTitle(List<String> peopleTitle) {
        this.peopleTitle = peopleTitle;
    }

    public List<String> getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(List<String> peopleId) {
        this.peopleId = peopleId;
    }

    public List<String> getHasSubOrganization() {
        return hasSubOrganization;
    }

    public void setHasSubOrganization(List<String> hasSubOrganization) {
        this.hasSubOrganization = hasSubOrganization;
    }

    public List<String> getHasSubOrganizationId() {
        return hasSubOrganizationId;
    }

    public void setHasSubOrganizationId(List<String> hasSubOrganizationId) {
        this.hasSubOrganizationId = hasSubOrganizationId;
    }

    public List<String> getOrganizationWithin() {
        return organizationWithin;
    }

    public void setOrganizationWithin(List<String> organizationWithin) {
        this.organizationWithin = organizationWithin;
    }

    public List<String> getOrganizationWithinId() {
        return organizationWithinId;
    }

    public void setOrganizationWithinId(List<String> organizationWithinId) {
        this.organizationWithinId = organizationWithinId;
    }

    public List<String> getLeadOrganizationOf() {
        return leadOrganizationOf;
    }

    public void setLeadOrganizationOf(List<String> leadOrganizationOf) {
        this.leadOrganizationOf = leadOrganizationOf;
    }

    public List<String> getLeadOrganizationOfId() {
        return leadOrganizationOfId;
    }

    public void setLeadOrganizationOfId(List<String> leadOrganizationOfId) {
        this.leadOrganizationOfId = leadOrganizationOfId;
    }

    public List<String> getHasCollaboratingOrganizatgionOrGroup() {
        return hasCollaboratingOrganizatgionOrGroup;
    }

    public void setHasCollaboratingOrganizatgionOrGroup(List<String> hasCollaboratingOrganizatgionOrGroup) {
        this.hasCollaboratingOrganizatgionOrGroup = hasCollaboratingOrganizatgionOrGroup;
    }

    public List<String> getHasCollaboratingOrganizatgionOrGroupId() {
        return hasCollaboratingOrganizatgionOrGroupId;
    }

    public void setHasCollaboratingOrganizatgionOrGroupId(List<String> hasCollaboratingOrganizatgionOrGroupId) {
        this.hasCollaboratingOrganizatgionOrGroupId = hasCollaboratingOrganizatgionOrGroupId;
    }

    public List<String> getHasAffiliatedOrganization() {
        return hasAffiliatedOrganization;
    }

    public void setHasAffiliatedOrganization(List<String> hasAffiliatedOrganization) {
        this.hasAffiliatedOrganization = hasAffiliatedOrganization;
    }

    public List<String> getHasAffiliatedOrganizationId() {
        return hasAffiliatedOrganizationId;
    }

    public void setHasAffiliatedOrganizationId(List<String> hasAffiliatedOrganizationId) {
        this.hasAffiliatedOrganizationId = hasAffiliatedOrganizationId;
    }

    public List<String> getMemberOf() {
        return memberOf;
    }

    public void setMemberOf(List<String> memberOf) {
        this.memberOf = memberOf;
    }

    public List<String> getMemberOfId() {
        return memberOfId;
    }

    public void setMemberOfId(List<String> memberOfId) {
        this.memberOfId = memberOfId;
    }

    public List<String> getClinicalActivity() {
        return clinicalActivity;
    }

    public void setClinicalActivity(List<String> clinicalActivity) {
        this.clinicalActivity = clinicalActivity;
    }

    public List<String> getClinicalActivityId() {
        return clinicalActivityId;
    }

    public void setClinicalActivityId(List<String> clinicalActivityId) {
        this.clinicalActivityId = clinicalActivityId;
    }

    public List<String> getConvenerOfEvent() {
        return convenerOfEvent;
    }

    public void setConvenerOfEvent(List<String> convenerOfEvent) {
        this.convenerOfEvent = convenerOfEvent;
    }

    public List<String> getConvenerOfEventId() {
        return convenerOfEventId;
    }

    public void setConvenerOfEventId(List<String> convenerOfEventId) {
        this.convenerOfEventId = convenerOfEventId;
    }

    public List<String> getAttendedEvent() {
        return attendedEvent;
    }

    public void setAttendedEvent(List<String> attendedEvent) {
        this.attendedEvent = attendedEvent;
    }

    public List<String> getAttendedEventId() {
        return attendedEventId;
    }

    public void setAttendedEventId(List<String> attendedEventId) {
        this.attendedEventId = attendedEventId;
    }

    public List<String> getSelectedPublication() {
        return selectedPublication;
    }

    public void setSelectedPublication(List<String> selectedPublication) {
        this.selectedPublication = selectedPublication;
    }

    public List<String> getSelectedPublicationId() {
        return selectedPublicationId;
    }

    public void setSelectedPublicationId(List<String> selectedPublicationId) {
        this.selectedPublicationId = selectedPublicationId;
    }

    public List<String> getPublisherOf() {
        return publisherOf;
    }

    public void setPublisherOf(List<String> publisherOf) {
        this.publisherOf = publisherOf;
    }

    public List<String> getPublisherOfId() {
        return publisherOfId;
    }

    public void setPublisherOfId(List<String> publisherOfId) {
        this.publisherOfId = publisherOfId;
    }

    public List<String> getPresentation() {
        return presentation;
    }

    public void setPresentation(List<String> presentation) {
        this.presentation = presentation;
    }

    public List<String> getPresentationId() {
        return presentationId;
    }

    public void setPresentationId(List<String> presentationId) {
        this.presentationId = presentationId;
    }

    public List<String> getFeaturedIn() {
        return featuredIn;
    }

    public void setFeaturedIn(List<String> featuredIn) {
        this.featuredIn = featuredIn;
    }

    public List<String> getFeaturedInId() {
        return featuredInId;
    }

    public void setFeaturedInId(List<String> featuredInId) {
        this.featuredInId = featuredInId;
    }

    public List<String> getAssigneeForPatent() {
        return assigneeForPatent;
    }

    public void setAssigneeForPatent(List<String> assigneeForPatent) {
        this.assigneeForPatent = assigneeForPatent;
    }

    public List<String> getAssigneeForPatentId() {
        return assigneeForPatentId;
    }

    public void setAssigneeForPatentId(List<String> assigneeForPatentId) {
        this.assigneeForPatentId = assigneeForPatentId;
    }

    public List<String> getTranslatorOf() {
        return translatorOf;
    }

    public void setTranslatorOf(List<String> translatorOf) {
        this.translatorOf = translatorOf;
    }

    public List<String> getTranslatorOfId() {
        return translatorOfId;
    }

    public void setTranslatorOfId(List<String> translatorOfId) {
        this.translatorOfId = translatorOfId;
    }

    public List<String> getAwardsGrant() {
        return awardsGrant;
    }

    public void setAwardsGrant(List<String> awardsGrant) {
        this.awardsGrant = awardsGrant;
    }

    public List<String> getAwardsGrantId() {
        return awardsGrantId;
    }

    public void setAwardsGrantId(List<String> awardsGrantId) {
        this.awardsGrantId = awardsGrantId;
    }

    public List<String> getAdministersGrant() {
        return administersGrant;
    }

    public void setAdministersGrant(List<String> administersGrant) {
        this.administersGrant = administersGrant;
    }

    public List<String> getAdministersGrants() {
        return administersGrants;
    }

    public void setAdministersGrants(List<String> administersGrants) {
        this.administersGrants = administersGrants;
    }

    public List<String> getSubcontractsGrant() {
        return subcontractsGrant;
    }

    public void setSubcontractsGrant(List<String> subcontractsGrant) {
        this.subcontractsGrant = subcontractsGrant;
    }

    public List<String> getSubcontractsGrantId() {
        return subcontractsGrantId;
    }

    public void setSubcontractsGrantId(List<String> subcontractsGrantId) {
        this.subcontractsGrantId = subcontractsGrantId;
    }

    public List<String> getPerformHumanStudy() {
        return performHumanStudy;
    }

    public void setPerformHumanStudy(List<String> performHumanStudy) {
        this.performHumanStudy = performHumanStudy;
    }

    public List<String> getPerformHumanStudyId() {
        return performHumanStudyId;
    }

    public void setPerformHumanStudyId(List<String> performHumanStudyId) {
        this.performHumanStudyId = performHumanStudyId;
    }

    public List<String> getContractOrProviderForService() {
        return contractOrProviderForService;
    }

    public void setContractOrProviderForService(List<String> contractOrProviderForService) {
        this.contractOrProviderForService = contractOrProviderForService;
    }

    public List<String> getContractOrProviderForServiceId() {
        return contractOrProviderForServiceId;
    }

    public void setContractOrProviderForServiceId(List<String> contractOrProviderForServiceId) {
        this.contractOrProviderForServiceId = contractOrProviderForServiceId;
    }

    public List<String> getOutreachAndCommunityServiceActivity() {
        return outreachAndCommunityServiceActivity;
    }

    public void setOutreachAndCommunityServiceActivity(List<String> outreachAndCommunityServiceActivity) {
        this.outreachAndCommunityServiceActivity = outreachAndCommunityServiceActivity;
    }

    public List<String> getOutreachAndCommunityServiceActivityId() {
        return outreachAndCommunityServiceActivityId;
    }

    public void setOutreachAndCommunityServiceActivityId(List<String> outreachAndCommunityServiceActivityId) {
        this.outreachAndCommunityServiceActivityId = outreachAndCommunityServiceActivityId;
    }

    public List<String> getHasEquipment() {
        return hasEquipment;
    }

    public void setHasEquipment(List<String> hasEquipment) {
        this.hasEquipment = hasEquipment;
    }

    public List<String> getHasEquipmentId() {
        return hasEquipmentId;
    }

    public void setHasEquipmentId(List<String> hasEquipmentId) {
        this.hasEquipmentId = hasEquipmentId;
    }

    public List<String> getOffersCource() {
        return offersCource;
    }

    public void setOffersCource(List<String> offersCource) {
        this.offersCource = offersCource;
    }

    public List<String> getOffersCourceId() {
        return offersCourceId;
    }

    public void setOffersCourceId(List<String> offersCourceId) {
        this.offersCourceId = offersCourceId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public List<String> getSameAs() {
        return sameAs;
    }

    public void setSameAs(List<String> sameAs) {
        this.sameAs = sameAs;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGeographicLocation() {
        return geographicLocation;
    }

    public void setGeographicLocation(String geographicLocation) {
        this.geographicLocation = geographicLocation;
    }

    public List<String> getLocatedAtFacility() {
        return locatedAtFacility;
    }

    public void setLocatedAtFacility(List<String> locatedAtFacility) {
        this.locatedAtFacility = locatedAtFacility;
    }

    public List<String> getLocatedAtFacilityId() {
        return locatedAtFacilityId;
    }

    public void setLocatedAtFacilityId(List<String> locatedAtFacilityId) {
        this.locatedAtFacilityId = locatedAtFacilityId;
    }

    public List<String> getPredecessorOrganization() {
        return predecessorOrganization;
    }

    public void setPredecessorOrganization(List<String> predecessorOrganization) {
        this.predecessorOrganization = predecessorOrganization;
    }

    public List<String> getPredecessorOrganizationId() {
        return predecessorOrganizationId;
    }

    public void setPredecessorOrganizationId(List<String> predecessorOrganizationId) {
        this.predecessorOrganizationId = predecessorOrganizationId;
    }

    public List<String> getSuccessorOrganization() {
        return successorOrganization;
    }

    public void setSuccessorOrganization(List<String> successorOrganization) {
        this.successorOrganization = successorOrganization;
    }

    public List<String> getSuccessorOrganizationId() {
        return successorOrganizationId;
    }

    public void setSuccessorOrganizationId(List<String> successorOrganizationId) {
        this.successorOrganizationId = successorOrganizationId;
    }

    public List<String> getGoverningAuthorityFor() {
        return governingAuthorityFor;
    }

    public void setGoverningAuthorityFor(List<String> governingAuthorityFor) {
        this.governingAuthorityFor = governingAuthorityFor;
    }

    public List<String> getGoverningAuthorityForId() {
        return governingAuthorityForId;
    }

    public void setGoverningAuthorityForId(List<String> governingAuthorityForId) {
        this.governingAuthorityForId = governingAuthorityForId;
    }

    public List<String> getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(List<String> researchArea) {
        this.researchArea = researchArea;
    }

    public List<String> getResearchAreaId() {
        return researchAreaId;
    }

    public void setResearchAreaId(List<String> researchAreaId) {
        this.researchAreaId = researchAreaId;
    }

}
