package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			if (!theDataset.commitNeeded) {
				pageContext.getOut().print(theDataset.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			return theDataset.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Dataset for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			theDataset.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for subjectURI tag ");
		}
	}
}

