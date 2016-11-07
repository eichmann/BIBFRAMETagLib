package edu.uiowa.slis.BIBFRAME.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Title extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Title currentInstance = null;
	private static final Log log = LogFactory.getLog(Title.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			TitleIterator theTitleIterator = (TitleIterator) findAncestorWithClass(this, TitleIterator.class);

			if (theTitleIterator != null) {
				subjectURI = theTitleIterator.getSubjectURI();
				label = theTitleIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasDerivativeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasDerivativeIterator)this.getParent()).getHasDerivative();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleHasDerivativeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleHasDerivativeIterator)this.getParent()).getHasDerivative();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPreferredTitleIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPreferredTitleIterator)this.getParent()).getHasPreferredTitle();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasPreferredTitleIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasPreferredTitleIterator)this.getParent()).getHasPreferredTitle();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkDerivedFromIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkDerivedFromIterator)this.getParent()).getDerivedFrom();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleDerivedFromIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleDerivedFromIterator)this.getParent()).getDerivedFrom();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceHasTitleIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceHasTitleIterator)this.getParent()).getHasTitle();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Item.ItemHasTitleIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Item.ItemHasTitleIterator)this.getParent()).getHasTitle();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasTitleIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasTitleIterator)this.getParent()).getHasTitle();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasDerivativeIterator theWorkHasDerivativeIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasDerivativeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasDerivativeIterator.class);

			if (subjectURI == null && theWorkHasDerivativeIterator != null) {
				subjectURI = theWorkHasDerivativeIterator.getHasDerivative();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleHasDerivativeIterator theTitleHasDerivativeIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleHasDerivativeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleHasDerivativeIterator.class);

			if (subjectURI == null && theTitleHasDerivativeIterator != null) {
				subjectURI = theTitleHasDerivativeIterator.getHasDerivative();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPreferredTitleIterator theInstanceHasPreferredTitleIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPreferredTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPreferredTitleIterator.class);

			if (subjectURI == null && theInstanceHasPreferredTitleIterator != null) {
				subjectURI = theInstanceHasPreferredTitleIterator.getHasPreferredTitle();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasPreferredTitleIterator theWorkHasPreferredTitleIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasPreferredTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasPreferredTitleIterator.class);

			if (subjectURI == null && theWorkHasPreferredTitleIterator != null) {
				subjectURI = theWorkHasPreferredTitleIterator.getHasPreferredTitle();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkDerivedFromIterator theWorkDerivedFromIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkDerivedFromIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkDerivedFromIterator.class);

			if (subjectURI == null && theWorkDerivedFromIterator != null) {
				subjectURI = theWorkDerivedFromIterator.getDerivedFrom();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleDerivedFromIterator theTitleDerivedFromIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleDerivedFromIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleDerivedFromIterator.class);

			if (subjectURI == null && theTitleDerivedFromIterator != null) {
				subjectURI = theTitleDerivedFromIterator.getDerivedFrom();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceHasTitleIterator theInstanceHasTitleIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceHasTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceHasTitleIterator.class);

			if (subjectURI == null && theInstanceHasTitleIterator != null) {
				subjectURI = theInstanceHasTitleIterator.getHasTitle();
			}

			edu.uiowa.slis.BIBFRAME.Item.ItemHasTitleIterator theItemHasTitleIterator = (edu.uiowa.slis.BIBFRAME.Item.ItemHasTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Item.ItemHasTitleIterator.class);

			if (subjectURI == null && theItemHasTitleIterator != null) {
				subjectURI = theItemHasTitleIterator.getHasTitle();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasTitleIterator theWorkHasTitleIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasTitleIterator.class);

			if (subjectURI == null && theWorkHasTitleIterator != null) {
				subjectURI = theWorkHasTitleIterator.getHasTitle();
			}

			if (theTitleIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Title doStartTag", e);
			throw new JspTagException("Exception raised in Title doStartTag");
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
			log.error("Exception raised in Title doEndTag", e);
			throw new JspTagException("Exception raised in Title doEndTag");
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
