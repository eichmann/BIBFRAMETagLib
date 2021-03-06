package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetSubjectIterator theDatasetSubjectIterator = (DatasetSubjectIterator)findAncestorWithClass(this, DatasetSubjectIterator.class);
			pageContext.getOut().print(theDatasetSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for subject tag ");
		}
		return SKIP_BODY;
	}
}

