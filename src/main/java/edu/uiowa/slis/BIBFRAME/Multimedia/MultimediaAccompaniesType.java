package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaAccompaniesIterator theMultimediaAccompaniesIterator = (MultimediaAccompaniesIterator)findAncestorWithClass(this, MultimediaAccompaniesIterator.class);
			pageContext.getOut().print(theMultimediaAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

