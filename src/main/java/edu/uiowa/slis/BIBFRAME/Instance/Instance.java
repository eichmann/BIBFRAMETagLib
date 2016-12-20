package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Instance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Instance currentInstance = null;
	private static final Log log = LogFactory.getLog(Instance.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			InstanceIterator theInstanceIterator = (InstanceIterator) findAncestorWithClass(this, InstanceIterator.class);

			if (theInstanceIterator != null) {
				subjectURI = theInstanceIterator.getSubjectURI();
				label = theInstanceIterator.getLabel();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Item.ItemIsHoldingForIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Item.ItemIsHoldingForIterator)this.getParent()).getIsHoldingFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWORelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWORelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniedByIterator)this.getParent()).getAccompaniedBy();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourcePrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourcePrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourcePrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourcePrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstancePrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstancePrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourcePrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourcePrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImagePrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImagePrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourcePrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourcePrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImagePrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImagePrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Event.EventPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Event.EventPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator)this.getParent()).getIdentifies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator)this.getParent()).getIsTitleOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceHasReproductionIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceHasReproductionIterator)this.getParent()).getHasReproduction();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator)this.getParent()).getHasTarget();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniesIterator)this.getParent()).getAccompanies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniesIterator)this.getParent()).getAccompanies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniesIterator)this.getParent()).getAccompanies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextAccompaniesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextAccompaniesIterator)this.getParent()).getAccompanies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceAccompaniesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceAccompaniesIterator)this.getParent()).getAccompanies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniesIterator)this.getParent()).getAccompanies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniesIterator)this.getParent()).getAccompanies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniesIterator)this.getParent()).getAccompanies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniesIterator)this.getParent()).getAccompanies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceAccompaniesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceAccompaniesIterator)this.getParent()).getAccompanies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageAccompaniesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageAccompaniesIterator)this.getParent()).getAccompanies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Event.EventFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Event.EventFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceReproducesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceReproducesIterator)this.getParent()).getReproduces();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Provision.ProvisionMadeAvailableIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Provision.ProvisionMadeAvailableIterator)this.getParent()).getMadeAvailable();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Event.EventHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Event.EventHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator)this.getParent()).getHasInstance();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Concept.ConceptIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Concept.ConceptIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Event.EventIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Event.EventIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Family.FamilyIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Family.FamilyIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Event.EventIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Event.EventIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Event.EventRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Event.EventRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator)this.getParent()).getLanguageInverse();
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

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceSubjectIterator theContinuingResourceSubjectIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceSubjectIterator.class);

			if (subjectURI == null && theContinuingResourceSubjectIterator != null) {
				subjectURI = theContinuingResourceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator theSerialSubjectIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator.class);

			if (subjectURI == null && theSerialSubjectIterator != null) {
				subjectURI = theSerialSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator theAudioSubjectIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator.class);

			if (subjectURI == null && theAudioSubjectIterator != null) {
				subjectURI = theAudioSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator theMovingImageSubjectIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator.class);

			if (subjectURI == null && theMovingImageSubjectIterator != null) {
				subjectURI = theMovingImageSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator theNotatedMusicSubjectIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator.class);

			if (subjectURI == null && theNotatedMusicSubjectIterator != null) {
				subjectURI = theNotatedMusicSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator theCollectionSubjectIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator.class);

			if (subjectURI == null && theCollectionSubjectIterator != null) {
				subjectURI = theCollectionSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator theCartographySubjectIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator.class);

			if (subjectURI == null && theCartographySubjectIterator != null) {
				subjectURI = theCartographySubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator theStillImageSubjectIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator.class);

			if (subjectURI == null && theStillImageSubjectIterator != null) {
				subjectURI = theStillImageSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator theRWOSubjectIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator.class);

			if (subjectURI == null && theRWOSubjectIterator != null) {
				subjectURI = theRWOSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Item.ItemIsHoldingForIterator theItemIsHoldingForIterator = (edu.uiowa.slis.BIBFRAME.Item.ItemIsHoldingForIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Item.ItemIsHoldingForIterator.class);

			if (subjectURI == null && theItemIsHoldingForIterator != null) {
				subjectURI = theItemIsHoldingForIterator.getIsHoldingFor();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator theWorkRelationIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator.class);

			if (subjectURI == null && theWorkRelationIterator != null) {
				subjectURI = theWorkRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationIterator theResourceRelationIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationIterator.class);

			if (subjectURI == null && theResourceRelationIterator != null) {
				subjectURI = theResourceRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingRelationIterator theThingRelationIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingRelationIterator.class);

			if (subjectURI == null && theThingRelationIterator != null) {
				subjectURI = theThingRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceRelationIterator theFiniteResourceRelationIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceRelationIterator.class);

			if (subjectURI == null && theFiniteResourceRelationIterator != null) {
				subjectURI = theFiniteResourceRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator theMonographRelationIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator.class);

			if (subjectURI == null && theMonographRelationIterator != null) {
				subjectURI = theMonographRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator theTextRelationIterator = (edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator.class);

			if (subjectURI == null && theTextRelationIterator != null) {
				subjectURI = theTextRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator theInstanceRelationIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator.class);

			if (subjectURI == null && theInstanceRelationIterator != null) {
				subjectURI = theInstanceRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator theAudioRelationIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator.class);

			if (subjectURI == null && theAudioRelationIterator != null) {
				subjectURI = theAudioRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceRelationIterator theContinuingResourceRelationIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceRelationIterator.class);

			if (subjectURI == null && theContinuingResourceRelationIterator != null) {
				subjectURI = theContinuingResourceRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator theSerialRelationIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator.class);

			if (subjectURI == null && theSerialRelationIterator != null) {
				subjectURI = theSerialRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator theMovingImageRelationIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator.class);

			if (subjectURI == null && theMovingImageRelationIterator != null) {
				subjectURI = theMovingImageRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator theNotatedMusicRelationIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator.class);

			if (subjectURI == null && theNotatedMusicRelationIterator != null) {
				subjectURI = theNotatedMusicRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator theCartographyRelationIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator.class);

			if (subjectURI == null && theCartographyRelationIterator != null) {
				subjectURI = theCartographyRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator theDatasetRelationIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator.class);

			if (subjectURI == null && theDatasetRelationIterator != null) {
				subjectURI = theDatasetRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator theMultimediaRelationIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator.class);

			if (subjectURI == null && theMultimediaRelationIterator != null) {
				subjectURI = theMultimediaRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator theCollectionRelationIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator.class);

			if (subjectURI == null && theCollectionRelationIterator != null) {
				subjectURI = theCollectionRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationIterator theStillImageRelationIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationIterator.class);

			if (subjectURI == null && theStillImageRelationIterator != null) {
				subjectURI = theStillImageRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator theIntegratingResourceRelationIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator.class);

			if (subjectURI == null && theIntegratingResourceRelationIterator != null) {
				subjectURI = theIntegratingResourceRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWORelationIterator theRWORelationIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWORelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWORelationIterator.class);

			if (subjectURI == null && theRWORelationIterator != null) {
				subjectURI = theRWORelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniedByIterator theWorkAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniedByIterator.class);

			if (subjectURI == null && theWorkAccompaniedByIterator != null) {
				subjectURI = theWorkAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniedByIterator theResourceAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniedByIterator.class);

			if (subjectURI == null && theResourceAccompaniedByIterator != null) {
				subjectURI = theResourceAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniedByIterator theThingAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniedByIterator.class);

			if (subjectURI == null && theThingAccompaniedByIterator != null) {
				subjectURI = theThingAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator theTextAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator.class);

			if (subjectURI == null && theTextAccompaniedByIterator != null) {
				subjectURI = theTextAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceAccompaniedByIterator theContinuingResourceAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceAccompaniedByIterator.class);

			if (subjectURI == null && theContinuingResourceAccompaniedByIterator != null) {
				subjectURI = theContinuingResourceAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniedByIterator theSerialAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniedByIterator.class);

			if (subjectURI == null && theSerialAccompaniedByIterator != null) {
				subjectURI = theSerialAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniedByIterator theInstanceAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniedByIterator.class);

			if (subjectURI == null && theInstanceAccompaniedByIterator != null) {
				subjectURI = theInstanceAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniedByIterator theFiniteResourceAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniedByIterator.class);

			if (subjectURI == null && theFiniteResourceAccompaniedByIterator != null) {
				subjectURI = theFiniteResourceAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniedByIterator theMonographAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniedByIterator.class);

			if (subjectURI == null && theMonographAccompaniedByIterator != null) {
				subjectURI = theMonographAccompaniedByIterator.getAccompaniedBy();
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

			edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator thePerformerContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator.class);

			if (subjectURI == null && thePerformerContributionAgentIterator != null) {
				subjectURI = thePerformerContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator theEditorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator.class);

			if (subjectURI == null && theEditorContributionAgentIterator != null) {
				subjectURI = theEditorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator theManufacturerProvisionAgentIterator = (edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator.class);

			if (subjectURI == null && theManufacturerProvisionAgentIterator != null) {
				subjectURI = theManufacturerProvisionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourcePrecedesIterator theResourcePrecedesIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourcePrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourcePrecedesIterator.class);

			if (subjectURI == null && theResourcePrecedesIterator != null) {
				subjectURI = theResourcePrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingPrecedesIterator theThingPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingPrecedesIterator.class);

			if (subjectURI == null && theThingPrecedesIterator != null) {
				subjectURI = theThingPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator theWorkPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator.class);

			if (subjectURI == null && theWorkPrecedesIterator != null) {
				subjectURI = theWorkPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator theTextPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator.class);

			if (subjectURI == null && theTextPrecedesIterator != null) {
				subjectURI = theTextPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourcePrecedesIterator theContinuingResourcePrecedesIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourcePrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourcePrecedesIterator.class);

			if (subjectURI == null && theContinuingResourcePrecedesIterator != null) {
				subjectURI = theContinuingResourcePrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator theSerialPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator.class);

			if (subjectURI == null && theSerialPrecedesIterator != null) {
				subjectURI = theSerialPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstancePrecedesIterator theInstancePrecedesIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstancePrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstancePrecedesIterator.class);

			if (subjectURI == null && theInstancePrecedesIterator != null) {
				subjectURI = theInstancePrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourcePrecedesIterator theFiniteResourcePrecedesIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourcePrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourcePrecedesIterator.class);

			if (subjectURI == null && theFiniteResourcePrecedesIterator != null) {
				subjectURI = theFiniteResourcePrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator theMonographPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator.class);

			if (subjectURI == null && theMonographPrecedesIterator != null) {
				subjectURI = theMonographPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyPrecedesIterator theCartographyPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyPrecedesIterator.class);

			if (subjectURI == null && theCartographyPrecedesIterator != null) {
				subjectURI = theCartographyPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImagePrecedesIterator theStillImagePrecedesIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImagePrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImagePrecedesIterator.class);

			if (subjectURI == null && theStillImagePrecedesIterator != null) {
				subjectURI = theStillImagePrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentPrecedesIterator theAgentPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentPrecedesIterator.class);

			if (subjectURI == null && theAgentPrecedesIterator != null) {
				subjectURI = theAgentPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Organization.OrganizationPrecedesIterator theOrganizationPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Organization.OrganizationPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Organization.OrganizationPrecedesIterator.class);

			if (subjectURI == null && theOrganizationPrecedesIterator != null) {
				subjectURI = theOrganizationPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourcePrecedesIterator theIntegratingResourcePrecedesIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourcePrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourcePrecedesIterator.class);

			if (subjectURI == null && theIntegratingResourcePrecedesIterator != null) {
				subjectURI = theIntegratingResourcePrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOPrecedesIterator theRWOPrecedesIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOPrecedesIterator.class);

			if (subjectURI == null && theRWOPrecedesIterator != null) {
				subjectURI = theRWOPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Person.PersonPrecedesIterator thePersonPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Person.PersonPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Person.PersonPrecedesIterator.class);

			if (subjectURI == null && thePersonPrecedesIterator != null) {
				subjectURI = thePersonPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Location.LocationPrecedesIterator theLocationPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationPrecedesIterator.class);

			if (subjectURI == null && theLocationPrecedesIterator != null) {
				subjectURI = theLocationPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImagePrecedesIterator theMovingImagePrecedesIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImagePrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImagePrecedesIterator.class);

			if (subjectURI == null && theMovingImagePrecedesIterator != null) {
				subjectURI = theMovingImagePrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator theThreeDimensionalObjectPrecedesIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectPrecedesIterator != null) {
				subjectURI = theThreeDimensionalObjectPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Event.EventPrecedesIterator theEventPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Event.EventPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Event.EventPrecedesIterator.class);

			if (subjectURI == null && theEventPrecedesIterator != null) {
				subjectURI = theEventPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Meeting.MeetingPrecedesIterator theMeetingPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Meeting.MeetingPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Meeting.MeetingPrecedesIterator.class);

			if (subjectURI == null && theMeetingPrecedesIterator != null) {
				subjectURI = theMeetingPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaPrecedesIterator theMultimediaPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaPrecedesIterator.class);

			if (subjectURI == null && theMultimediaPrecedesIterator != null) {
				subjectURI = theMultimediaPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetPrecedesIterator theDatasetPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetPrecedesIterator.class);

			if (subjectURI == null && theDatasetPrecedesIterator != null) {
				subjectURI = theDatasetPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionPrecedesIterator theCollectionPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionPrecedesIterator.class);

			if (subjectURI == null && theCollectionPrecedesIterator != null) {
				subjectURI = theCollectionPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator theIdentifierIdentifiesIterator = (edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator.class);

			if (subjectURI == null && theIdentifierIdentifiesIterator != null) {
				subjectURI = theIdentifierIdentifiesIterator.getIdentifies();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator theTitleIsTitleOfIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator.class);

			if (subjectURI == null && theTitleIsTitleOfIterator != null) {
				subjectURI = theTitleIsTitleOfIterator.getIsTitleOf();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceHasReproductionIterator theInstanceHasReproductionIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceHasReproductionIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceHasReproductionIterator.class);

			if (subjectURI == null && theInstanceHasReproductionIterator != null) {
				subjectURI = theInstanceHasReproductionIterator.getHasReproduction();
			}

			edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator theAnnotationHasTargetIterator = (edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator.class);

			if (subjectURI == null && theAnnotationHasTargetIterator != null) {
				subjectURI = theAnnotationHasTargetIterator.getHasTarget();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniesIterator theWorkAccompaniesIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniesIterator.class);

			if (subjectURI == null && theWorkAccompaniesIterator != null) {
				subjectURI = theWorkAccompaniesIterator.getAccompanies();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniesIterator theResourceAccompaniesIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniesIterator.class);

			if (subjectURI == null && theResourceAccompaniesIterator != null) {
				subjectURI = theResourceAccompaniesIterator.getAccompanies();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniesIterator theThingAccompaniesIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniesIterator.class);

			if (subjectURI == null && theThingAccompaniesIterator != null) {
				subjectURI = theThingAccompaniesIterator.getAccompanies();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextAccompaniesIterator theTextAccompaniesIterator = (edu.uiowa.slis.BIBFRAME.Text.TextAccompaniesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextAccompaniesIterator.class);

			if (subjectURI == null && theTextAccompaniesIterator != null) {
				subjectURI = theTextAccompaniesIterator.getAccompanies();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceAccompaniesIterator theContinuingResourceAccompaniesIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceAccompaniesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceAccompaniesIterator.class);

			if (subjectURI == null && theContinuingResourceAccompaniesIterator != null) {
				subjectURI = theContinuingResourceAccompaniesIterator.getAccompanies();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniesIterator theSerialAccompaniesIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniesIterator.class);

			if (subjectURI == null && theSerialAccompaniesIterator != null) {
				subjectURI = theSerialAccompaniesIterator.getAccompanies();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniesIterator theFiniteResourceAccompaniesIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniesIterator.class);

			if (subjectURI == null && theFiniteResourceAccompaniesIterator != null) {
				subjectURI = theFiniteResourceAccompaniesIterator.getAccompanies();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniesIterator theMonographAccompaniesIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniesIterator.class);

			if (subjectURI == null && theMonographAccompaniesIterator != null) {
				subjectURI = theMonographAccompaniesIterator.getAccompanies();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniesIterator theInstanceAccompaniesIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniesIterator.class);

			if (subjectURI == null && theInstanceAccompaniesIterator != null) {
				subjectURI = theInstanceAccompaniesIterator.getAccompanies();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceAccompaniesIterator theIntegratingResourceAccompaniesIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceAccompaniesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceAccompaniesIterator.class);

			if (subjectURI == null && theIntegratingResourceAccompaniesIterator != null) {
				subjectURI = theIntegratingResourceAccompaniesIterator.getAccompanies();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageAccompaniesIterator theMovingImageAccompaniesIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageAccompaniesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageAccompaniesIterator.class);

			if (subjectURI == null && theMovingImageAccompaniesIterator != null) {
				subjectURI = theMovingImageAccompaniesIterator.getAccompanies();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator theResourceFollowsIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator.class);

			if (subjectURI == null && theResourceFollowsIterator != null) {
				subjectURI = theResourceFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator theThingFollowsIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator.class);

			if (subjectURI == null && theThingFollowsIterator != null) {
				subjectURI = theThingFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator theWorkFollowsIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator.class);

			if (subjectURI == null && theWorkFollowsIterator != null) {
				subjectURI = theWorkFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator theTextFollowsIterator = (edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator.class);

			if (subjectURI == null && theTextFollowsIterator != null) {
				subjectURI = theTextFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceFollowsIterator theFiniteResourceFollowsIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceFollowsIterator.class);

			if (subjectURI == null && theFiniteResourceFollowsIterator != null) {
				subjectURI = theFiniteResourceFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator theMonographFollowsIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator.class);

			if (subjectURI == null && theMonographFollowsIterator != null) {
				subjectURI = theMonographFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceFollowsIterator theContinuingResourceFollowsIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceFollowsIterator.class);

			if (subjectURI == null && theContinuingResourceFollowsIterator != null) {
				subjectURI = theContinuingResourceFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialFollowsIterator theSerialFollowsIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialFollowsIterator.class);

			if (subjectURI == null && theSerialFollowsIterator != null) {
				subjectURI = theSerialFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator theInstanceFollowsIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator.class);

			if (subjectURI == null && theInstanceFollowsIterator != null) {
				subjectURI = theInstanceFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator theMovingImageFollowsIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator.class);

			if (subjectURI == null && theMovingImageFollowsIterator != null) {
				subjectURI = theMovingImageFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator theCartographyFollowsIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator.class);

			if (subjectURI == null && theCartographyFollowsIterator != null) {
				subjectURI = theCartographyFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator theRWOFollowsIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator.class);

			if (subjectURI == null && theRWOFollowsIterator != null) {
				subjectURI = theRWOFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator theStillImageFollowsIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator.class);

			if (subjectURI == null && theStillImageFollowsIterator != null) {
				subjectURI = theStillImageFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentFollowsIterator theAgentFollowsIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentFollowsIterator.class);

			if (subjectURI == null && theAgentFollowsIterator != null) {
				subjectURI = theAgentFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Organization.OrganizationFollowsIterator theOrganizationFollowsIterator = (edu.uiowa.slis.BIBFRAME.Organization.OrganizationFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Organization.OrganizationFollowsIterator.class);

			if (subjectURI == null && theOrganizationFollowsIterator != null) {
				subjectURI = theOrganizationFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Person.PersonFollowsIterator thePersonFollowsIterator = (edu.uiowa.slis.BIBFRAME.Person.PersonFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Person.PersonFollowsIterator.class);

			if (subjectURI == null && thePersonFollowsIterator != null) {
				subjectURI = thePersonFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Location.LocationFollowsIterator theLocationFollowsIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationFollowsIterator.class);

			if (subjectURI == null && theLocationFollowsIterator != null) {
				subjectURI = theLocationFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator theThreeDimensionalObjectFollowsIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectFollowsIterator != null) {
				subjectURI = theThreeDimensionalObjectFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Event.EventFollowsIterator theEventFollowsIterator = (edu.uiowa.slis.BIBFRAME.Event.EventFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Event.EventFollowsIterator.class);

			if (subjectURI == null && theEventFollowsIterator != null) {
				subjectURI = theEventFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Meeting.MeetingFollowsIterator theMeetingFollowsIterator = (edu.uiowa.slis.BIBFRAME.Meeting.MeetingFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Meeting.MeetingFollowsIterator.class);

			if (subjectURI == null && theMeetingFollowsIterator != null) {
				subjectURI = theMeetingFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicFollowsIterator theNotatedMusicFollowsIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicFollowsIterator.class);

			if (subjectURI == null && theNotatedMusicFollowsIterator != null) {
				subjectURI = theNotatedMusicFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioFollowsIterator theAudioFollowsIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioFollowsIterator.class);

			if (subjectURI == null && theAudioFollowsIterator != null) {
				subjectURI = theAudioFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceFollowsIterator theIntegratingResourceFollowsIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceFollowsIterator.class);

			if (subjectURI == null && theIntegratingResourceFollowsIterator != null) {
				subjectURI = theIntegratingResourceFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator theDatasetFollowsIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator.class);

			if (subjectURI == null && theDatasetFollowsIterator != null) {
				subjectURI = theDatasetFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator theMultimediaFollowsIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator.class);

			if (subjectURI == null && theMultimediaFollowsIterator != null) {
				subjectURI = theMultimediaFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionFollowsIterator theCollectionFollowsIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionFollowsIterator.class);

			if (subjectURI == null && theCollectionFollowsIterator != null) {
				subjectURI = theCollectionFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceReproducesIterator theInstanceReproducesIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceReproducesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceReproducesIterator.class);

			if (subjectURI == null && theInstanceReproducesIterator != null) {
				subjectURI = theInstanceReproducesIterator.getReproduces();
			}

			edu.uiowa.slis.BIBFRAME.Provision.ProvisionMadeAvailableIterator theProvisionMadeAvailableIterator = (edu.uiowa.slis.BIBFRAME.Provision.ProvisionMadeAvailableIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Provision.ProvisionMadeAvailableIterator.class);

			if (subjectURI == null && theProvisionMadeAvailableIterator != null) {
				subjectURI = theProvisionMadeAvailableIterator.getMadeAvailable();
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

			edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator theAudioHasPartIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator.class);

			if (subjectURI == null && theAudioHasPartIterator != null) {
				subjectURI = theAudioHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator theNotatedMusicHasPartIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator.class);

			if (subjectURI == null && theNotatedMusicHasPartIterator != null) {
				subjectURI = theNotatedMusicHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator theInstanceHasPartIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator.class);

			if (subjectURI == null && theInstanceHasPartIterator != null) {
				subjectURI = theInstanceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator theMovingImageHasPartIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator.class);

			if (subjectURI == null && theMovingImageHasPartIterator != null) {
				subjectURI = theMovingImageHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasPartIterator theContinuingResourceHasPartIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasPartIterator.class);

			if (subjectURI == null && theContinuingResourceHasPartIterator != null) {
				subjectURI = theContinuingResourceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator theSerialHasPartIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator.class);

			if (subjectURI == null && theSerialHasPartIterator != null) {
				subjectURI = theSerialHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator theStillImageHasPartIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator.class);

			if (subjectURI == null && theStillImageHasPartIterator != null) {
				subjectURI = theStillImageHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOHasPartIterator theRWOHasPartIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOHasPartIterator.class);

			if (subjectURI == null && theRWOHasPartIterator != null) {
				subjectURI = theRWOHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator theCartographyHasPartIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator.class);

			if (subjectURI == null && theCartographyHasPartIterator != null) {
				subjectURI = theCartographyHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator theIntegratingResourceHasPartIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator.class);

			if (subjectURI == null && theIntegratingResourceHasPartIterator != null) {
				subjectURI = theIntegratingResourceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator theMultimediaHasPartIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator.class);

			if (subjectURI == null && theMultimediaHasPartIterator != null) {
				subjectURI = theMultimediaHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator theDatasetHasPartIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator.class);

			if (subjectURI == null && theDatasetHasPartIterator != null) {
				subjectURI = theDatasetHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator theThreeDimensionalObjectHasPartIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectHasPartIterator != null) {
				subjectURI = theThreeDimensionalObjectHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentHasPartIterator theAgentHasPartIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentHasPartIterator.class);

			if (subjectURI == null && theAgentHasPartIterator != null) {
				subjectURI = theAgentHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Organization.OrganizationHasPartIterator theOrganizationHasPartIterator = (edu.uiowa.slis.BIBFRAME.Organization.OrganizationHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Organization.OrganizationHasPartIterator.class);

			if (subjectURI == null && theOrganizationHasPartIterator != null) {
				subjectURI = theOrganizationHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Location.LocationHasPartIterator theLocationHasPartIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationHasPartIterator.class);

			if (subjectURI == null && theLocationHasPartIterator != null) {
				subjectURI = theLocationHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Event.EventHasPartIterator theEventHasPartIterator = (edu.uiowa.slis.BIBFRAME.Event.EventHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Event.EventHasPartIterator.class);

			if (subjectURI == null && theEventHasPartIterator != null) {
				subjectURI = theEventHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Meeting.MeetingHasPartIterator theMeetingHasPartIterator = (edu.uiowa.slis.BIBFRAME.Meeting.MeetingHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Meeting.MeetingHasPartIterator.class);

			if (subjectURI == null && theMeetingHasPartIterator != null) {
				subjectURI = theMeetingHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Person.PersonHasPartIterator thePersonHasPartIterator = (edu.uiowa.slis.BIBFRAME.Person.PersonHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Person.PersonHasPartIterator.class);

			if (subjectURI == null && thePersonHasPartIterator != null) {
				subjectURI = thePersonHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator theWorkHasInstanceIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator.class);

			if (subjectURI == null && theWorkHasInstanceIterator != null) {
				subjectURI = theWorkHasInstanceIterator.getHasInstance();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceIsSubjectOfIterator theResourceIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceIsSubjectOfIterator.class);

			if (subjectURI == null && theResourceIsSubjectOfIterator != null) {
				subjectURI = theResourceIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator theThingIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator.class);

			if (subjectURI == null && theThingIsSubjectOfIterator != null) {
				subjectURI = theThingIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator theRWOIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator.class);

			if (subjectURI == null && theRWOIsSubjectOfIterator != null) {
				subjectURI = theRWOIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator theTopicIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator.class);

			if (subjectURI == null && theTopicIsSubjectOfIterator != null) {
				subjectURI = theTopicIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Concept.ConceptIsSubjectOfIterator theConceptIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Concept.ConceptIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Concept.ConceptIsSubjectOfIterator.class);

			if (subjectURI == null && theConceptIsSubjectOfIterator != null) {
				subjectURI = theConceptIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator theAuthorityIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator.class);

			if (subjectURI == null && theAuthorityIsSubjectOfIterator != null) {
				subjectURI = theAuthorityIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentIsSubjectOfIterator theAgentIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentIsSubjectOfIterator.class);

			if (subjectURI == null && theAgentIsSubjectOfIterator != null) {
				subjectURI = theAgentIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator thePersonIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator.class);

			if (subjectURI == null && thePersonIsSubjectOfIterator != null) {
				subjectURI = thePersonIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsSubjectOfIterator theOrganizationIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsSubjectOfIterator.class);

			if (subjectURI == null && theOrganizationIsSubjectOfIterator != null) {
				subjectURI = theOrganizationIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkIsSubjectOfIterator theWorkIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkIsSubjectOfIterator.class);

			if (subjectURI == null && theWorkIsSubjectOfIterator != null) {
				subjectURI = theWorkIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator theTemporalEntityIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator.class);

			if (subjectURI == null && theTemporalEntityIsSubjectOfIterator != null) {
				subjectURI = theTemporalEntityIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Event.EventIsSubjectOfIterator theEventIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Event.EventIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Event.EventIsSubjectOfIterator.class);

			if (subjectURI == null && theEventIsSubjectOfIterator != null) {
				subjectURI = theEventIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator theMeetingIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator.class);

			if (subjectURI == null && theMeetingIsSubjectOfIterator != null) {
				subjectURI = theMeetingIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator theConferenceIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator.class);

			if (subjectURI == null && theConferenceIsSubjectOfIterator != null) {
				subjectURI = theConferenceIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Location.LocationIsSubjectOfIterator theLocationIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationIsSubjectOfIterator.class);

			if (subjectURI == null && theLocationIsSubjectOfIterator != null) {
				subjectURI = theLocationIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsSubjectOfIterator theFiniteResourceIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsSubjectOfIterator.class);

			if (subjectURI == null && theFiniteResourceIsSubjectOfIterator != null) {
				subjectURI = theFiniteResourceIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographIsSubjectOfIterator theMonographIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographIsSubjectOfIterator.class);

			if (subjectURI == null && theMonographIsSubjectOfIterator != null) {
				subjectURI = theMonographIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextIsSubjectOfIterator theTextIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Text.TextIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextIsSubjectOfIterator.class);

			if (subjectURI == null && theTextIsSubjectOfIterator != null) {
				subjectURI = theTextIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceIsSubjectOfIterator theInstanceIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceIsSubjectOfIterator.class);

			if (subjectURI == null && theInstanceIsSubjectOfIterator != null) {
				subjectURI = theInstanceIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Family.FamilyIsSubjectOfIterator theFamilyIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Family.FamilyIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Family.FamilyIsSubjectOfIterator.class);

			if (subjectURI == null && theFamilyIsSubjectOfIterator != null) {
				subjectURI = theFamilyIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioIsSubjectOfIterator theAudioIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioIsSubjectOfIterator.class);

			if (subjectURI == null && theAudioIsSubjectOfIterator != null) {
				subjectURI = theAudioIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsSubjectOfIterator theNotatedMusicIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsSubjectOfIterator.class);

			if (subjectURI == null && theNotatedMusicIsSubjectOfIterator != null) {
				subjectURI = theNotatedMusicIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsSubjectOfIterator theCartographyIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsSubjectOfIterator.class);

			if (subjectURI == null && theCartographyIsSubjectOfIterator != null) {
				subjectURI = theCartographyIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator theStillImageIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator.class);

			if (subjectURI == null && theStillImageIsSubjectOfIterator != null) {
				subjectURI = theStillImageIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsSubjectOfIterator theDatasetIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsSubjectOfIterator.class);

			if (subjectURI == null && theDatasetIsSubjectOfIterator != null) {
				subjectURI = theDatasetIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsSubjectOfIterator theMultimediaIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsSubjectOfIterator.class);

			if (subjectURI == null && theMultimediaIsSubjectOfIterator != null) {
				subjectURI = theMultimediaIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsSubjectOfIterator theMovingImageIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsSubjectOfIterator.class);

			if (subjectURI == null && theMovingImageIsSubjectOfIterator != null) {
				subjectURI = theMovingImageIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator theResourceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator.class);

			if (subjectURI == null && theResourceIsPartOfIterator != null) {
				subjectURI = theResourceIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator theThingIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator.class);

			if (subjectURI == null && theThingIsPartOfIterator != null) {
				subjectURI = theThingIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator theWorkIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator.class);

			if (subjectURI == null && theWorkIsPartOfIterator != null) {
				subjectURI = theWorkIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsPartOfIterator theFiniteResourceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsPartOfIterator.class);

			if (subjectURI == null && theFiniteResourceIsPartOfIterator != null) {
				subjectURI = theFiniteResourceIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator theMonographIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator.class);

			if (subjectURI == null && theMonographIsPartOfIterator != null) {
				subjectURI = theMonographIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator theTextIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator.class);

			if (subjectURI == null && theTextIsPartOfIterator != null) {
				subjectURI = theTextIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator theAudioIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator.class);

			if (subjectURI == null && theAudioIsPartOfIterator != null) {
				subjectURI = theAudioIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentIsPartOfIterator theAgentIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentIsPartOfIterator.class);

			if (subjectURI == null && theAgentIsPartOfIterator != null) {
				subjectURI = theAgentIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOIsPartOfIterator theRWOIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOIsPartOfIterator.class);

			if (subjectURI == null && theRWOIsPartOfIterator != null) {
				subjectURI = theRWOIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsPartOfIterator theOrganizationIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Organization.OrganizationIsPartOfIterator.class);

			if (subjectURI == null && theOrganizationIsPartOfIterator != null) {
				subjectURI = theOrganizationIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceIsPartOfIterator theInstanceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceIsPartOfIterator.class);

			if (subjectURI == null && theInstanceIsPartOfIterator != null) {
				subjectURI = theInstanceIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator theCollectionIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator.class);

			if (subjectURI == null && theCollectionIsPartOfIterator != null) {
				subjectURI = theCollectionIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator theCartographyIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator.class);

			if (subjectURI == null && theCartographyIsPartOfIterator != null) {
				subjectURI = theCartographyIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator theMovingImageIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator.class);

			if (subjectURI == null && theMovingImageIsPartOfIterator != null) {
				subjectURI = theMovingImageIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Location.LocationIsPartOfIterator theLocationIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationIsPartOfIterator.class);

			if (subjectURI == null && theLocationIsPartOfIterator != null) {
				subjectURI = theLocationIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Person.PersonIsPartOfIterator thePersonIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Person.PersonIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Person.PersonIsPartOfIterator.class);

			if (subjectURI == null && thePersonIsPartOfIterator != null) {
				subjectURI = thePersonIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator theNotatedMusicIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator.class);

			if (subjectURI == null && theNotatedMusicIsPartOfIterator != null) {
				subjectURI = theNotatedMusicIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsPartOfIterator theStillImageIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsPartOfIterator.class);

			if (subjectURI == null && theStillImageIsPartOfIterator != null) {
				subjectURI = theStillImageIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator theContinuingResourceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator.class);

			if (subjectURI == null && theContinuingResourceIsPartOfIterator != null) {
				subjectURI = theContinuingResourceIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator theSerialIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator.class);

			if (subjectURI == null && theSerialIsPartOfIterator != null) {
				subjectURI = theSerialIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator theMultimediaIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator.class);

			if (subjectURI == null && theMultimediaIsPartOfIterator != null) {
				subjectURI = theMultimediaIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator theDatasetIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator.class);

			if (subjectURI == null && theDatasetIsPartOfIterator != null) {
				subjectURI = theDatasetIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsPartOfIterator theTemporalEntityIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsPartOfIterator.class);

			if (subjectURI == null && theTemporalEntityIsPartOfIterator != null) {
				subjectURI = theTemporalEntityIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator theThreeDimensionalObjectIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectIsPartOfIterator != null) {
				subjectURI = theThreeDimensionalObjectIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Event.EventIsPartOfIterator theEventIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Event.EventIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Event.EventIsPartOfIterator.class);

			if (subjectURI == null && theEventIsPartOfIterator != null) {
				subjectURI = theEventIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsPartOfIterator theMeetingIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsPartOfIterator.class);

			if (subjectURI == null && theMeetingIsPartOfIterator != null) {
				subjectURI = theMeetingIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsPartOfIterator theConferenceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsPartOfIterator.class);

			if (subjectURI == null && theConferenceIsPartOfIterator != null) {
				subjectURI = theConferenceIsPartOfIterator.getIsPartOf();
			}

			if (theInstanceIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Instance doStartTag", e);
			throw new JspTagException("Exception raised in Instance doStartTag");
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
			log.error("Exception raised in Instance doEndTag", e);
			throw new JspTagException("Exception raised in Instance doEndTag");
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
