package edu.uiowa.slis.BIBFRAME.NonSortElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class NonSortElement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NonSortElement currentInstance = null;
	private static final Log log = LogFactory.getLog(NonSortElement.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			NonSortElementIterator theNonSortElementIterator = (NonSortElementIterator) findAncestorWithClass(this, NonSortElementIterator.class);

			if (theNonSortElementIterator != null) {
				subjectURI = theNonSortElementIterator.getSubjectURI();
				label = theNonSortElementIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator)this.getParent()).getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator theDatasetHasPartIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator.class);

			if (subjectURI == null && theDatasetHasPartIterator != null) {
				subjectURI = theDatasetHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator theThreeDimensionalObjectHasPartIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectHasPartIterator != null) {
				subjectURI = theThreeDimensionalObjectHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasPartIterator theNotatedMovementHasPartIterator = (edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasPartIterator.class);

			if (subjectURI == null && theNotatedMovementHasPartIterator != null) {
				subjectURI = theNotatedMovementHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator theAudioHasPartIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator.class);

			if (subjectURI == null && theAudioHasPartIterator != null) {
				subjectURI = theAudioHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator theMovingImageHasPartIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator.class);

			if (subjectURI == null && theMovingImageHasPartIterator != null) {
				subjectURI = theMovingImageHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator theIntegratingResourceHasPartIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator.class);

			if (subjectURI == null && theIntegratingResourceHasPartIterator != null) {
				subjectURI = theIntegratingResourceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator theCartographyHasPartIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator.class);

			if (subjectURI == null && theCartographyHasPartIterator != null) {
				subjectURI = theCartographyHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator theCollectionHasPartIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator.class);

			if (subjectURI == null && theCollectionHasPartIterator != null) {
				subjectURI = theCollectionHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator theKeyTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator.class);

			if (subjectURI == null && theKeyTitleHasPartIterator != null) {
				subjectURI = theKeyTitleHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator theNotatedMusicHasPartIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator.class);

			if (subjectURI == null && theNotatedMusicHasPartIterator != null) {
				subjectURI = theNotatedMusicHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator theMonographHasPartIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator.class);

			if (subjectURI == null && theMonographHasPartIterator != null) {
				subjectURI = theMonographHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator theStillImageHasPartIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator.class);

			if (subjectURI == null && theStillImageHasPartIterator != null) {
				subjectURI = theStillImageHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator theMultimediaHasPartIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator.class);

			if (subjectURI == null && theMultimediaHasPartIterator != null) {
				subjectURI = theMultimediaHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator theAbbreviatedTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator.class);

			if (subjectURI == null && theAbbreviatedTitleHasPartIterator != null) {
				subjectURI = theAbbreviatedTitleHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator theDatasetFollowsIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator.class);

			if (subjectURI == null && theDatasetFollowsIterator != null) {
				subjectURI = theDatasetFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator theThreeDimensionalObjectFollowsIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectFollowsIterator != null) {
				subjectURI = theThreeDimensionalObjectFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator theMovingImageFollowsIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator.class);

			if (subjectURI == null && theMovingImageFollowsIterator != null) {
				subjectURI = theMovingImageFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator theCartographyFollowsIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator.class);

			if (subjectURI == null && theCartographyFollowsIterator != null) {
				subjectURI = theCartographyFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator theStillImageFollowsIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator.class);

			if (subjectURI == null && theStillImageFollowsIterator != null) {
				subjectURI = theStillImageFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator theMultimediaFollowsIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator.class);

			if (subjectURI == null && theMultimediaFollowsIterator != null) {
				subjectURI = theMultimediaFollowsIterator.getFollows();
			}

			if (theNonSortElementIterator == null && subjectURI == null) {
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
			log.error("Exception raised in NonSortElement doStartTag", e);
			throw new JspTagException("Exception raised in NonSortElement doStartTag");
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
			log.error("Exception raised in NonSortElement doEndTag", e);
			throw new JspTagException("Exception raised in NonSortElement doEndTag");
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
