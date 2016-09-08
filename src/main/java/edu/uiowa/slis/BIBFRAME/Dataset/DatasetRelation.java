package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetRelationIterator theDatasetRelationIterator = (DatasetRelationIterator)findAncestorWithClass(this, DatasetRelationIterator.class);
			pageContext.getOut().print(theDatasetRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for relation tag ");
		}
		return SKIP_BODY;
	}
}

