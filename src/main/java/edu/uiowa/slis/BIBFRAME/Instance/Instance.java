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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator)this.getParent()).getHasInstance();
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

			edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator theWorkHasInstanceIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasInstanceIterator.class);

			if (subjectURI == null && theWorkHasInstanceIterator != null) {
				subjectURI = theWorkHasInstanceIterator.getHasInstance();
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
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  ?aspectRatio where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://bib.ld4l.org/ontology/legacy/aspectRatio> ?aspectRatio } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
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
