package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasAnnotationIterator theDatasetHasAnnotationIterator = (DatasetHasAnnotationIterator)findAncestorWithClass(this, DatasetHasAnnotationIterator.class);
			pageContext.getOut().print(theDatasetHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

