package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Item extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Item currentInstance = null;
	private static final Log log = LogFactory.getLog(Item.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ItemIterator theItemIterator = (ItemIterator) findAncestorWithClass(this, ItemIterator.class);

			if (theItemIterator != null) {
				subjectURI = theItemIterator.getSubjectURI();
				label = theItemIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetGovernsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetGovernsIterator)this.getParent()).getGoverns();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator)this.getParent()).getIsTitleOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceHasHoldingIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceHasHoldingIterator)this.getParent()).getHasHolding();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentHeldByInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentHeldByInverseIterator)this.getParent()).getHeldByInverse();
			}

			edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetGovernsIterator thePolicySetGovernsIterator = (edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetGovernsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PolicySet.PolicySetGovernsIterator.class);

			if (subjectURI == null && thePolicySetGovernsIterator != null) {
				subjectURI = thePolicySetGovernsIterator.getGoverns();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator theTitleIsTitleOfIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator.class);

			if (subjectURI == null && theTitleIsTitleOfIterator != null) {
				subjectURI = theTitleIsTitleOfIterator.getIsTitleOf();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceHasHoldingIterator theInstanceHasHoldingIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceHasHoldingIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceHasHoldingIterator.class);

			if (subjectURI == null && theInstanceHasHoldingIterator != null) {
				subjectURI = theInstanceHasHoldingIterator.getHasHolding();
			}

			if (theItemIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Item doStartTag", e);
			throw new JspTagException("Exception raised in Item doStartTag");
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
			log.error("Exception raised in Item doEndTag", e);
			throw new JspTagException("Exception raised in Item doEndTag");
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
