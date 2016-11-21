package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Location extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Location currentInstance = null;
	private static final Log log = LogFactory.getLog(Location.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			LocationIterator theLocationIterator = (LocationIterator) findAncestorWithClass(this, LocationIterator.class);

			if (theLocationIterator != null) {
				subjectURI = theLocationIterator.getSubjectURI();
				label = theLocationIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAtLocationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAtLocationIterator)this.getParent()).getAtLocation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAtLocationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAtLocationIterator)this.getParent()).getAtLocation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAtLocationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAtLocationIterator)this.getParent()).getAtLocation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasOriginPlaceIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasOriginPlaceIterator)this.getParent()).getHasOriginPlace();
			}

			edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAtLocationIterator theDistributorProvisionAtLocationIterator = (edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAtLocationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAtLocationIterator.class);

			if (subjectURI == null && theDistributorProvisionAtLocationIterator != null) {
				subjectURI = theDistributorProvisionAtLocationIterator.getAtLocation();
			}

			edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAtLocationIterator theManufacturerProvisionAtLocationIterator = (edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAtLocationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAtLocationIterator.class);

			if (subjectURI == null && theManufacturerProvisionAtLocationIterator != null) {
				subjectURI = theManufacturerProvisionAtLocationIterator.getAtLocation();
			}

			edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAtLocationIterator thePublisherProvisionAtLocationIterator = (edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAtLocationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAtLocationIterator.class);

			if (subjectURI == null && thePublisherProvisionAtLocationIterator != null) {
				subjectURI = thePublisherProvisionAtLocationIterator.getAtLocation();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasOriginPlaceIterator theWorkHasOriginPlaceIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasOriginPlaceIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasOriginPlaceIterator.class);

			if (subjectURI == null && theWorkHasOriginPlaceIterator != null) {
				subjectURI = theWorkHasOriginPlaceIterator.getHasOriginPlace();
			}

			if (theLocationIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Location doStartTag", e);
			throw new JspTagException("Exception raised in Location doStartTag");
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
			log.error("Exception raised in Location doEndTag", e);
			throw new JspTagException("Exception raised in Location doEndTag");
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
