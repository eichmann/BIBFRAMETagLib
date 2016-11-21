package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Electronic extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Electronic currentInstance = null;
	private static final Log log = LogFactory.getLog(Electronic.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String aspectRatio = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ElectronicIterator theElectronicIterator = (ElectronicIterator) findAncestorWithClass(this, ElectronicIterator.class);

			if (theElectronicIterator != null) {
				subjectURI = theElectronicIterator.getSubjectURI();
				label = theElectronicIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator)this.getParent()).getIdentifies();
			}

			edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator theIdentifierIdentifiesIterator = (edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator.class);

			if (subjectURI == null && theIdentifierIdentifiesIterator != null) {
				subjectURI = theIdentifierIdentifiesIterator.getIdentifies();
			}

			if (theElectronicIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Electronic doStartTag", e);
			throw new JspTagException("Exception raised in Electronic doStartTag");
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
			log.error("Exception raised in Electronic doEndTag", e);
			throw new JspTagException("Exception raised in Electronic doEndTag");
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
