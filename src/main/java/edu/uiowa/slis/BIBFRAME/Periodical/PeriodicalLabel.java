package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			if (!thePeriodical.commitNeeded) {
				pageContext.getOut().print(thePeriodical.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			return thePeriodical.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Periodical for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			thePeriodical.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for label tag ");
		}
	}
}

