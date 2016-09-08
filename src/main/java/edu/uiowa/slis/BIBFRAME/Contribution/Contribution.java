package edu.uiowa.slis.BIBFRAME.Contribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Contribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Contribution currentInstance = null;
	private static final Log log = LogFactory.getLog(Contribution.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ContributionIterator theContributionIterator = (ContributionIterator) findAncestorWithClass(this, ContributionIterator.class);

			if (theContributionIterator != null) {
				subjectURI = theContributionIterator.getSubjectURI();
				label = theContributionIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasContributionIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasContributionIterator)this.getParent()).getHasContribution();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasContributionIterator theWorkHasContributionIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasContributionIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasContributionIterator.class);

			if (subjectURI == null && theWorkHasContributionIterator != null) {
				subjectURI = theWorkHasContributionIterator.getHasContribution();
			}

			if (theContributionIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Contribution doStartTag", e);
			throw new JspTagException("Exception raised in Contribution doStartTag");
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
			log.error("Exception raised in Contribution doEndTag", e);
			throw new JspTagException("Exception raised in Contribution doEndTag");
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
