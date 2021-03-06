package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetRelationIterator theDatasetRelationIterator = (DatasetRelationIterator)findAncestorWithClass(this, DatasetRelationIterator.class);
			pageContext.getOut().print(theDatasetRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for relation tag ");
		}
		return SKIP_BODY;
	}
}

