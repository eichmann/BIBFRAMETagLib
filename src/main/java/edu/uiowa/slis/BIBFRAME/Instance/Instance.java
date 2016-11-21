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

	String aspectRatio = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			InstanceIterator theInstanceIterator = (InstanceIterator) findAncestorWithClass(this, InstanceIterator.class);

			if (theInstanceIterator != null) {
				subjectURI = theInstanceIterator.getSubjectURI();
				label = theInstanceIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Item.ItemIsHoldingForIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Item.ItemIsHoldingForIterator)this.getParent()).getIsHoldingFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Provision.ProvisionMadeAvailableIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Provision.ProvisionMadeAvailableIterator)this.getParent()).getMadeAvailable();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceHasReproductionIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceHasReproductionIterator)this.getParent()).getHasReproduction();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator)this.getParent()).getIsTitleOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator)this.getParent()).getHasInstance();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleIsPreferredTitleOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleIsPreferredTitleOfIterator)this.getParent()).getIsPreferredTitleOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator)this.getParent()).getIdentifies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceReproducesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceReproducesIterator)this.getParent()).getReproduces();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceEquivalentToIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceEquivalentToIterator)this.getParent()).getEquivalentTo();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceIssuedWithIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceIssuedWithIterator)this.getParent()).getIssuedWith();
			}

			edu.uiowa.slis.BIBFRAME.Item.ItemIsHoldingForIterator theItemIsHoldingForIterator = (edu.uiowa.slis.BIBFRAME.Item.ItemIsHoldingForIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Item.ItemIsHoldingForIterator.class);

			if (subjectURI == null && theItemIsHoldingForIterator != null) {
				subjectURI = theItemIsHoldingForIterator.getIsHoldingFor();
			}

			edu.uiowa.slis.BIBFRAME.Provision.ProvisionMadeAvailableIterator theProvisionMadeAvailableIterator = (edu.uiowa.slis.BIBFRAME.Provision.ProvisionMadeAvailableIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Provision.ProvisionMadeAvailableIterator.class);

			if (subjectURI == null && theProvisionMadeAvailableIterator != null) {
				subjectURI = theProvisionMadeAvailableIterator.getMadeAvailable();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceHasReproductionIterator theInstanceHasReproductionIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceHasReproductionIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceHasReproductionIterator.class);

			if (subjectURI == null && theInstanceHasReproductionIterator != null) {
				subjectURI = theInstanceHasReproductionIterator.getHasReproduction();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator theTitleIsTitleOfIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator.class);

			if (subjectURI == null && theTitleIsTitleOfIterator != null) {
				subjectURI = theTitleIsTitleOfIterator.getIsTitleOf();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator theWorkHasInstanceIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator.class);

			if (subjectURI == null && theWorkHasInstanceIterator != null) {
				subjectURI = theWorkHasInstanceIterator.getHasInstance();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleIsPreferredTitleOfIterator theTitleIsPreferredTitleOfIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleIsPreferredTitleOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleIsPreferredTitleOfIterator.class);

			if (subjectURI == null && theTitleIsPreferredTitleOfIterator != null) {
				subjectURI = theTitleIsPreferredTitleOfIterator.getIsPreferredTitleOf();
			}

			edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator theIdentifierIdentifiesIterator = (edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator.class);

			if (subjectURI == null && theIdentifierIdentifiesIterator != null) {
				subjectURI = theIdentifierIdentifiesIterator.getIdentifies();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceReproducesIterator theInstanceReproducesIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceReproducesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceReproducesIterator.class);

			if (subjectURI == null && theInstanceReproducesIterator != null) {
				subjectURI = theInstanceReproducesIterator.getReproduces();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceEquivalentToIterator theInstanceEquivalentToIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceEquivalentToIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceEquivalentToIterator.class);

			if (subjectURI == null && theInstanceEquivalentToIterator != null) {
				subjectURI = theInstanceEquivalentToIterator.getEquivalentTo();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceIssuedWithIterator theInstanceIssuedWithIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceIssuedWithIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceIssuedWithIterator.class);

			if (subjectURI == null && theInstanceIssuedWithIterator != null) {
				subjectURI = theInstanceIssuedWithIterator.getIssuedWith();
			}

			if (theInstanceIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?aspectRatio where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://bib.ld4l.org/ontology/legacy/aspectRatio> ?aspectRatio } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
					aspectRatio = sol.get("?aspectRatio") == null ? null : sol.get("?aspectRatio").toString();
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

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setAspectRatio(String aspectRatio) {
		this.aspectRatio = aspectRatio;
	}

	public String getAspectRatio() {
		return aspectRatio;
	}

}
