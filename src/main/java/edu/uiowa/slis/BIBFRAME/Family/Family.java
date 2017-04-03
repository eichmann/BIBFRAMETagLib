package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Family extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Family currentInstance = null;
	private static final Log log = LogFactory.getLog(Family.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			FamilyIterator theFamilyIterator = (FamilyIterator) findAncestorWithClass(this, FamilyIterator.class);

			if (theFamilyIterator != null) {
				subjectURI = theFamilyIterator.getSubjectURI();
				label = theFamilyIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Provision.ProvisionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Provision.ProvisionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator)this.getParent()).getIdentifies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator)this.getParent()).getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator theWorkSubjectIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator.class);

			if (subjectURI == null && theWorkSubjectIterator != null) {
				subjectURI = theWorkSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceSubjectIterator theResourceSubjectIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceSubjectIterator.class);

			if (subjectURI == null && theResourceSubjectIterator != null) {
				subjectURI = theResourceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingSubjectIterator theThingSubjectIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingSubjectIterator.class);

			if (subjectURI == null && theThingSubjectIterator != null) {
				subjectURI = theThingSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator theTextSubjectIterator = (edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator.class);

			if (subjectURI == null && theTextSubjectIterator != null) {
				subjectURI = theTextSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceSubjectIterator theFiniteResourceSubjectIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceSubjectIterator.class);

			if (subjectURI == null && theFiniteResourceSubjectIterator != null) {
				subjectURI = theFiniteResourceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator theMonographSubjectIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator.class);

			if (subjectURI == null && theMonographSubjectIterator != null) {
				subjectURI = theMonographSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator theInstanceSubjectIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator.class);

			if (subjectURI == null && theInstanceSubjectIterator != null) {
				subjectURI = theInstanceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator theAudioSubjectIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator.class);

			if (subjectURI == null && theAudioSubjectIterator != null) {
				subjectURI = theAudioSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator theMovingImageSubjectIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator.class);

			if (subjectURI == null && theMovingImageSubjectIterator != null) {
				subjectURI = theMovingImageSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator theCollectionSubjectIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator.class);

			if (subjectURI == null && theCollectionSubjectIterator != null) {
				subjectURI = theCollectionSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator theStillImageSubjectIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator.class);

			if (subjectURI == null && theStillImageSubjectIterator != null) {
				subjectURI = theStillImageSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceAgentIterator theResourceAgentIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceAgentIterator.class);

			if (subjectURI == null && theResourceAgentIterator != null) {
				subjectURI = theResourceAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingAgentIterator theThingAgentIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingAgentIterator.class);

			if (subjectURI == null && theThingAgentIterator != null) {
				subjectURI = theThingAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator theContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator.class);

			if (subjectURI == null && theContributionAgentIterator != null) {
				subjectURI = theContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.Provision.ProvisionAgentIterator theProvisionAgentIterator = (edu.uiowa.slis.BIBFRAME.Provision.ProvisionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Provision.ProvisionAgentIterator.class);

			if (subjectURI == null && theProvisionAgentIterator != null) {
				subjectURI = theProvisionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator thePublisherProvisionAgentIterator = (edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator.class);

			if (subjectURI == null && thePublisherProvisionAgentIterator != null) {
				subjectURI = thePublisherProvisionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator theCreatorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator.class);

			if (subjectURI == null && theCreatorContributionAgentIterator != null) {
				subjectURI = theCreatorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator theAuthorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator.class);

			if (subjectURI == null && theAuthorContributionAgentIterator != null) {
				subjectURI = theAuthorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator theManufacturerProvisionAgentIterator = (edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator.class);

			if (subjectURI == null && theManufacturerProvisionAgentIterator != null) {
				subjectURI = theManufacturerProvisionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator theIdentifierIdentifiesIterator = (edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator.class);

			if (subjectURI == null && theIdentifierIdentifiesIterator != null) {
				subjectURI = theIdentifierIdentifiesIterator.getIdentifies();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator theResourceHasPartIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator.class);

			if (subjectURI == null && theResourceHasPartIterator != null) {
				subjectURI = theResourceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator theThingHasPartIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator.class);

			if (subjectURI == null && theThingHasPartIterator != null) {
				subjectURI = theThingHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator theWorkHasPartIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator.class);

			if (subjectURI == null && theWorkHasPartIterator != null) {
				subjectURI = theWorkHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasPartIterator theFiniteResourceHasPartIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasPartIterator.class);

			if (subjectURI == null && theFiniteResourceHasPartIterator != null) {
				subjectURI = theFiniteResourceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator theMonographHasPartIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator.class);

			if (subjectURI == null && theMonographHasPartIterator != null) {
				subjectURI = theMonographHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator theTextHasPartIterator = (edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator.class);

			if (subjectURI == null && theTextHasPartIterator != null) {
				subjectURI = theTextHasPartIterator.getHasPart();
			}

			if (theFamilyIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Family doStartTag", e);
			throw new JspTagException("Exception raised in Family doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Family doEndTag", e);
			throw new JspTagException("Exception raised in Family doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public  void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public  String getSubjectURI() {
		return subjectURI;
	}

	public  void setLabel(String theLabel) {
		label = theLabel;
	}

	public  String getLabel() {
		return label;
	}

}
