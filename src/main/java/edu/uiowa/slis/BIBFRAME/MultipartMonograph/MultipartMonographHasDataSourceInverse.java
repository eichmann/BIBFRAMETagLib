package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasDataSourceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasDataSourceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasDataSourceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasDataSourceInverseIterator theMultipartMonographHasDataSourceInverseIterator = (MultipartMonographHasDataSourceInverseIterator)findAncestorWithClass(this, MultipartMonographHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theMultipartMonographHasDataSourceInverseIterator.getHasDataSourceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

