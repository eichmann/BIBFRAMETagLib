package edu.uiowa.slis.BIBFRAME.Provision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Provision extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Provision currentInstance = null;
	private static final Log log = LogFactory.getLog(Provision.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ProvisionIterator theProvisionIterator = (ProvisionIterator) findAncestorWithClass(this, ProvisionIterator.class);

			if (theProvisionIterator != null) {
				subjectURI = theProvisionIterator.getSubjectURI();
				label = theProvisionIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceHasProvisionIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceHasProvisionIterator)this.getParent()).getHasProvision();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceHasProvisionIterator theInstanceHasProvisionIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceHasProvisionIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceHasProvisionIterator.class);

			if (subjectURI == null && theInstanceHasProvisionIterator != null) {
				subjectURI = theInstanceHasProvisionIterator.getHasProvision();
			}

			if (theProvisionIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Provision doStartTag", e);
			throw new JspTagException("Exception raised in Provision doStartTag");
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
			log.error("Exception raised in Provision doEndTag", e);
			throw new JspTagException("Exception raised in Provision doEndTag");
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
