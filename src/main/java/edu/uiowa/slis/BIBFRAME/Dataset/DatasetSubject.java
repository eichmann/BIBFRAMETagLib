package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetSubjectIterator theDatasetSubjectIterator = (DatasetSubjectIterator)findAncestorWithClass(this, DatasetSubjectIterator.class);
			pageContext.getOut().print(theDatasetSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for subject tag ");
		}
		return SKIP_BODY;
	}
}

