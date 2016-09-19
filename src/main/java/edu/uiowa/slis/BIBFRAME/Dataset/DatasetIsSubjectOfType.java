package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetIsSubjectOfIterator theDatasetIsSubjectOfIterator = (DatasetIsSubjectOfIterator)findAncestorWithClass(this, DatasetIsSubjectOfIterator.class);
			pageContext.getOut().print(theDatasetIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

