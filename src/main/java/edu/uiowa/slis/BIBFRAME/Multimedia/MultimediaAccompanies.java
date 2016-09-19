package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaAccompaniesIterator theMultimediaAccompaniesIterator = (MultimediaAccompaniesIterator)findAncestorWithClass(this, MultimediaAccompaniesIterator.class);
			pageContext.getOut().print(theMultimediaAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

