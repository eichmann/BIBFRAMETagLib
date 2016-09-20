package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographAccompaniesIterator theMultipartMonographAccompaniesIterator = (MultipartMonographAccompaniesIterator)findAncestorWithClass(this, MultipartMonographAccompaniesIterator.class);
			pageContext.getOut().print(theMultipartMonographAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

