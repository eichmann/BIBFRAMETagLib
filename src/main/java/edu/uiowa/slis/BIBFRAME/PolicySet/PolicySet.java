package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PolicySet extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySet currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySet.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PolicySetIterator thePolicySetIterator = (PolicySetIterator) findAncestorWithClass(this, PolicySetIterator.class);

			if (thePolicySetIterator != null) {
				subjectURI = thePolicySetIterator.getSubjectURI();
				label = thePolicySetIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Item.ItemGovernedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Item.ItemGovernedByIterator)this.getParent()).getGovernedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Policy.PolicyHasAccessPolicyInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Policy.PolicyHasAccessPolicyInverseIterator)this.getParent()).getHasAccessPolicyInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Policy.PolicyHasReproductionPolicyInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Policy.PolicyHasReproductionPolicyInverseIterator)this.getParent()).getHasReproductionPolicyInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Policy.PolicyHasPolicyInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Policy.PolicyHasPolicyInverseIterator)this.getParent()).getHasPolicyInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Policy.PolicyHasLendingPolicyInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Policy.PolicyHasLendingPolicyInverseIterator)this.getParent()).getHasLendingPolicyInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Policy.PolicyHasRetentionPolicyInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Policy.PolicyHasRetentionPolicyInverseIterator)this.getParent()).getHasRetentionPolicyInverse();
			}

			edu.uiowa.slis.BIBFRAME.Item.ItemGovernedByIterator theItemGovernedByIterator = (edu.uiowa.slis.BIBFRAME.Item.ItemGovernedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Item.ItemGovernedByIterator.class);

			if (subjectURI == null && theItemGovernedByIterator != null) {
				subjectURI = theItemGovernedByIterator.getGovernedBy();
			}

			if (thePolicySetIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
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
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in PolicySet doStartTag", e);
			throw new JspTagException("Exception raised in PolicySet doStartTag");
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
			log.error("Exception raised in PolicySet doEndTag", e);
			throw new JspTagException("Exception raised in PolicySet doEndTag");
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
