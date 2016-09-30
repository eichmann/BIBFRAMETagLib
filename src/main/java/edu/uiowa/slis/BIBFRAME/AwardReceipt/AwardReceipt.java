package edu.uiowa.slis.BIBFRAME.AwardReceipt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class AwardReceipt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AwardReceipt currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardReceipt.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			AwardReceiptIterator theAwardReceiptIterator = (AwardReceiptIterator) findAncestorWithClass(this, AwardReceiptIterator.class);

			if (theAwardReceiptIterator != null) {
				subjectURI = theAwardReceiptIterator.getSubjectURI();
				label = theAwardReceiptIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Award.AwardHasReceiptIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Award.AwardHasReceiptIterator)this.getParent()).getHasReceipt();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkReceivedIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkReceivedIterator)this.getParent()).getReceived();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentReceivedIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentReceivedIterator)this.getParent()).getReceived();
			}

			edu.uiowa.slis.BIBFRAME.Award.AwardHasReceiptIterator theAwardHasReceiptIterator = (edu.uiowa.slis.BIBFRAME.Award.AwardHasReceiptIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Award.AwardHasReceiptIterator.class);

			if (subjectURI == null && theAwardHasReceiptIterator != null) {
				subjectURI = theAwardHasReceiptIterator.getHasReceipt();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkReceivedIterator theWorkReceivedIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkReceivedIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkReceivedIterator.class);

			if (subjectURI == null && theWorkReceivedIterator != null) {
				subjectURI = theWorkReceivedIterator.getReceived();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentReceivedIterator theAgentReceivedIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentReceivedIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentReceivedIterator.class);

			if (subjectURI == null && theAgentReceivedIterator != null) {
				subjectURI = theAgentReceivedIterator.getReceived();
			}

			if (theAwardReceiptIterator == null && subjectURI == null) {
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
			log.error("Exception raised in AwardReceipt doStartTag", e);
			throw new JspTagException("Exception raised in AwardReceipt doStartTag");
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
			log.error("Exception raised in AwardReceipt doEndTag", e);
			throw new JspTagException("Exception raised in AwardReceipt doEndTag");
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
