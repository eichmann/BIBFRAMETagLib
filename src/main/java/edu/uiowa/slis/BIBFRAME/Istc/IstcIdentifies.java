package edu.uiowa.slis.BIBFRAME.Istc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IstcIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IstcIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(IstcIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IstcIdentifiesIterator theIstcIdentifiesIterator = (IstcIdentifiesIterator)findAncestorWithClass(this, IstcIdentifiesIterator.class);
			pageContext.getOut().print(theIstcIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Istc for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Istc for identifies tag ");
		}
		return SKIP_BODY;
	}
}

