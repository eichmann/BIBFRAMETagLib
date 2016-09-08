package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasDataSourceIterator theMultipartMonographHasDataSourceIterator = (MultipartMonographHasDataSourceIterator)findAncestorWithClass(this, MultipartMonographHasDataSourceIterator.class);
			pageContext.getOut().print(theMultipartMonographHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

