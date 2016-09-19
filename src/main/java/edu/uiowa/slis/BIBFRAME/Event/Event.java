package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Event extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Event currentInstance = null;
	private static final Log log = LogFactory.getLog(Event.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			EventIterator theEventIterator = (EventIterator) findAncestorWithClass(this, EventIterator.class);

			if (theEventIterator != null) {
				subjectURI = theEventIterator.getSubjectURI();
				label = theEventIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkPerformedAtIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkPerformedAtIterator)this.getParent()).getPerformedAt();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator)this.getParent()).getLocationOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkRecordedAtIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkRecordedAtIterator)this.getParent()).getRecordedAt();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkPerformedAtIterator theWorkPerformedAtIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkPerformedAtIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkPerformedAtIterator.class);

			if (subjectURI == null && theWorkPerformedAtIterator != null) {
				subjectURI = theWorkPerformedAtIterator.getPerformedAt();
			}

			edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator theLocationLocationOfIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator.class);

			if (subjectURI == null && theLocationLocationOfIterator != null) {
				subjectURI = theLocationLocationOfIterator.getLocationOf();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkRecordedAtIterator theWorkRecordedAtIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkRecordedAtIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkRecordedAtIterator.class);

			if (subjectURI == null && theWorkRecordedAtIterator != null) {
				subjectURI = theWorkRecordedAtIterator.getRecordedAt();
			}

			if (theEventIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Event doStartTag", e);
			throw new JspTagException("Exception raised in Event doStartTag");
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
			log.error("Exception raised in Event doEndTag", e);
			throw new JspTagException("Exception raised in Event doEndTag");
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
