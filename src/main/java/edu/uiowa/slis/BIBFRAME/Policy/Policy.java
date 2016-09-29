package edu.uiowa.slis.BIBFRAME.Policy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Policy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Policy currentInstance = null;
	private static final Log log = LogFactory.getLog(Policy.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PolicyIterator thePolicyIterator = (PolicyIterator) findAncestorWithClass(this, PolicyIterator.class);

			if (thePolicyIterator != null) {
				subjectURI = thePolicyIterator.getSubjectURI();
				label = thePolicyIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasAccessPolicyIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasAccessPolicyIterator)this.getParent()).getHasAccessPolicy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasReproductionPolicyIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasReproductionPolicyIterator)this.getParent()).getHasReproductionPolicy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasPolicyIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasPolicyIterator)this.getParent()).getHasPolicy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasLendingPolicyIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasLendingPolicyIterator)this.getParent()).getHasLendingPolicy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasRetentionPolicyIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasRetentionPolicyIterator)this.getParent()).getHasRetentionPolicy();
			}

			edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasAccessPolicyIterator thePolicySetHasAccessPolicyIterator = (edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasAccessPolicyIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasAccessPolicyIterator.class);

			if (subjectURI == null && thePolicySetHasAccessPolicyIterator != null) {
				subjectURI = thePolicySetHasAccessPolicyIterator.getHasAccessPolicy();
			}

			edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasReproductionPolicyIterator thePolicySetHasReproductionPolicyIterator = (edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasReproductionPolicyIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasReproductionPolicyIterator.class);

			if (subjectURI == null && thePolicySetHasReproductionPolicyIterator != null) {
				subjectURI = thePolicySetHasReproductionPolicyIterator.getHasReproductionPolicy();
			}

			edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasPolicyIterator thePolicySetHasPolicyIterator = (edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasPolicyIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasPolicyIterator.class);

			if (subjectURI == null && thePolicySetHasPolicyIterator != null) {
				subjectURI = thePolicySetHasPolicyIterator.getHasPolicy();
			}

			edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasLendingPolicyIterator thePolicySetHasLendingPolicyIterator = (edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasLendingPolicyIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasLendingPolicyIterator.class);

			if (subjectURI == null && thePolicySetHasLendingPolicyIterator != null) {
				subjectURI = thePolicySetHasLendingPolicyIterator.getHasLendingPolicy();
			}

			edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasRetentionPolicyIterator thePolicySetHasRetentionPolicyIterator = (edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasRetentionPolicyIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetHasRetentionPolicyIterator.class);

			if (subjectURI == null && thePolicySetHasRetentionPolicyIterator != null) {
				subjectURI = thePolicySetHasRetentionPolicyIterator.getHasRetentionPolicy();
			}

			if (thePolicyIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Policy doStartTag", e);
			throw new JspTagException("Exception raised in Policy doStartTag");
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
			log.error("Exception raised in Policy doEndTag", e);
			throw new JspTagException("Exception raised in Policy doEndTag");
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

}
