package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasOtherEditionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasOtherEditionType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasOtherEditionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasOtherEditionIterator theMonographHasOtherEditionIterator = (MonographHasOtherEditionIterator)findAncestorWithClass(this, MonographHasOtherEditionIterator.class);
			pageContext.getOut().print(theMonographHasOtherEditionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

