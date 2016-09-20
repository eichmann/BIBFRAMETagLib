package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasDataSourceInverseIterator theMultipartMonographHasDataSourceInverseIterator = (MultipartMonographHasDataSourceInverseIterator)findAncestorWithClass(this, MultipartMonographHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theMultipartMonographHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

