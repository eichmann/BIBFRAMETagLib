package edu.uiowa.slis.BIBFRAME.UdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcClassificationHasGenreInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcClassificationHasGenreInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcClassificationHasGenreInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcClassificationHasGenreInverseIterator theUdcClassificationHasGenreInverseIterator = (UdcClassificationHasGenreInverseIterator)findAncestorWithClass(this, UdcClassificationHasGenreInverseIterator.class);
			pageContext.getOut().print(theUdcClassificationHasGenreInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcClassification for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}
