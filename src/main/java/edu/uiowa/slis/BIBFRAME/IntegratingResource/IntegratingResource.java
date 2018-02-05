package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class IntegratingResource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResource currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResource.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			IntegratingResourceIterator theIntegratingResourceIterator = (IntegratingResourceIterator) findAncestorWithClass(this, IntegratingResourceIterator.class);

			if (theIntegratingResourceIterator != null) {
				subjectURI = theIntegratingResourceIterator.getSubjectURI();
				label = theIntegratingResourceIterator.getLabel();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniedByIterator)this.getParent()).getAccompaniedBy();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator)this.getParent()).getIdentifies();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator)this.getParent()).getFollows();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWORelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWORelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator)this.getParent()).getLanguageInverse();
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

			edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniedByIterator theInstanceAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceAccompaniedByIterator.class);

			if (subjectURI == null && theInstanceAccompaniedByIterator != null) {
				subjectURI = theInstanceAccompaniedByIterator.getAccompaniedBy();
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

			edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator theIdentifierIdentifiesIterator = (edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator.class);

			if (subjectURI == null && theIdentifierIdentifiesIterator != null) {
				subjectURI = theIdentifierIdentifiesIterator.getIdentifies();
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

			edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator theInstanceFollowsIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator.class);

			if (subjectURI == null && theInstanceFollowsIterator != null) {
				subjectURI = theInstanceFollowsIterator.getFollows();
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

			edu.uiowa.slis.BIBFRAME.Location.LocationIsPartOfIterator theLocationIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationIsPartOfIterator.class);

			if (subjectURI == null && theLocationIsPartOfIterator != null) {
				subjectURI = theLocationIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Person.PersonIsPartOfIterator thePersonIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Person.PersonIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Person.PersonIsPartOfIterator.class);

			if (subjectURI == null && thePersonIsPartOfIterator != null) {
				subjectURI = thePersonIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator theContinuingResourceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator.class);

			if (subjectURI == null && theContinuingResourceIsPartOfIterator != null) {
				subjectURI = theContinuingResourceIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator theSerialIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator.class);

			if (subjectURI == null && theSerialIsPartOfIterator != null) {
				subjectURI = theSerialIsPartOfIterator.getIsPartOf();
			}

			if (theIntegratingResourceIterator == null && subjectURI == null) {
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
			log.error("Exception raised in IntegratingResource doStartTag", e);
			throw new JspTagException("Exception raised in IntegratingResource doStartTag");
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
			log.error("Exception raised in IntegratingResource doEndTag", e);
			throw new JspTagException("Exception raised in IntegratingResource doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String theLabel) {
		label = theLabel;
	}

	public String getLabel() {
		return label;
	}

}
